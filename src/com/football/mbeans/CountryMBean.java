package com.football.mbeans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import com.football.entity.Country;

import java.util.List;

@Named
@RequestScoped
public class CountryMBean {

	private int countryId;
	private String continent;
	private String countryName;
	private List<Country> countryList;
	private String countrycode;

	public CountryMBean() {
		// TODO Auto-generated constructor stub
	}

	public int getCountryId() {
		return this.countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getContinent() {
		return this.continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	public String getCountryName() {
		return this.countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List<Country> getCountryList() {
		return countryList;
	}

	public void setCountryList(List<Country> countryList) {
		this.countryList = countryList;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	
}
