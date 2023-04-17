/**
 * 
 */
package com.football.mbeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped

/**
 * @author hp
 *
 */
public class PlayerMBean {

	private String playerName;
	private String position;
	private String previousClubs;
	private String middleName;
	private String lastName;
	private int goalsScored;
	private String firstName;
	private String currentTeam;
	private String country;
	private int cleanSheets;
	private int assists;
	private int age;
	private int playerId;

	/**
	 * 
	 */
	public PlayerMBean() {
		// TODO Auto-generated constructor stub
	}

	public int getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAssists() {
		return this.assists;
	}

	public void setAssists(int assists) {
		this.assists = assists;
	}

	public int getCleanSheets() {
		return this.cleanSheets;
	}

	public void setCleanSheets(int cleanSheets) {
		this.cleanSheets = cleanSheets;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCurrentTeam() {
		return this.currentTeam;
	}

	public void setCurrentTeam(String currentTeam) {
		this.currentTeam = currentTeam;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getGoalsScored() {
		return this.goalsScored;
	}

	public void setGoalsScored(int goalsScored) {
		this.goalsScored = goalsScored;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getPlayerName() {
		return this.playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getPreviousClubs() {
		return this.previousClubs;
	}

	public void setPreviousClubs(String previousClubs) {
		this.previousClubs = previousClubs;
	}


}
