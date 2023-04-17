package com.football.mbeans;
import java.util.Hashtable;
import java.util.Properties;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.naming.*;  
import javax.jms.*; 

@Named
@RequestScoped
public class QueueMBean {
    // Set the JNDI context factory for a JBOSS/ WildFly Server.
    public final static String JNDI_FACTORY="org.jboss.ejb.client.naming"; 
 
    // Set the JMS context factory.
    public final static String JMS_FACTORY="java:/ConnectionFactory";
 
    // Set the queue.
    public final static String QUEUE="java:/jms/queue/demo";
      
    // Set Wildfly URL.
    public final static String WildflyURL="http-remoting://localhost:8080";
  
    
    public void sendMessage(String message) throws Exception {
   
    //1) Create and start a connection 
    Properties properties = new Properties();
    properties.put(Context.URL_PKG_PREFIXES, JNDI_FACTORY);
     
    InitialContext ic=new InitialContext(properties); 
     
    QueueConnectionFactory f=(QueueConnectionFactory)ic.lookup(JMS_FACTORY) ;   
     
    QueueConnection con=f.createQueueConnection();  
    con.start();  
     
    //2) create queue session  
    QueueSession ses=con.createQueueSession(false, Session.AUTO_ACKNOWLEDGE);
     
    //3) get the Queue object  
    Queue t=(Queue)ic.lookup(QUEUE);  
     
    //4)create QueueSender object         
    QueueSender sender=ses.createSender(t);  
    
    //5) create TextMessage object  
     TextMessage msg=ses.createTextMessage();  
     msg.setText("This message will be send to a WildFly Queue !");
      
    //6) send message  
    sender.send(msg);  
    System.out.println("Message successfully sent to a WildFly Queue.");  
 
    //7) connection close 
    con.close();
 
    }
     
}

