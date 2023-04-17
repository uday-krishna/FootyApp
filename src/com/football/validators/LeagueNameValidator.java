package com.football.validators;

import javax.ejb.EJB;
import javax.enterprise.inject.spi.CDI;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import com.football.service.LeagueService;

@FacesValidator("LeagueNameValidator")
public class LeagueNameValidator implements Validator {

	// LeagueServiceImpl leagueService=EJB.lookup(LeagueServiceImpl.class);
	@EJB
	LeagueService leagueService;

	public LeagueNameValidator() {
		this.leagueService = CDI.current().select(LeagueService.class).get();
	}

	@Override
	public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException {
		// TODO Auto-generated method stub
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		if (value == null) {
			FacesMessage msg = new FacesMessage("Please select a Country");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
		String leagueCountry = value.toString();
		String leagueNameValue = ec.getRequestParameterMap().get("addLeagueForm:leagueName");

		if (leagueNameValue.isEmpty())

		{
			FacesMessage msg = new FacesMessage("League name is required");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
		int k = leagueService.findLeagueByName(leagueNameValue);
		if (k > 0) {
			FacesMessage msg = new FacesMessage("League name already exists");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}

	}

	public LeagueService getLeagueService() {
		return leagueService;
	}

	public void setLeagueService(LeagueService leagueService) {
		this.leagueService = leagueService;
	}

}
