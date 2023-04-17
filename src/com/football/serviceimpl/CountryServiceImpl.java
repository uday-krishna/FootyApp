package com.football.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import com.football.entity.Country;
import com.football.service.CountryService;


@Stateless
public class CountryServiceImpl implements CountryService {


	@Override
	public List<Country> getAllCountries() {
		Country c=new Country();
		c.setCountryName("IND");
		c.setContinent("ASIA");
		c.setCountryCode("1");
		
		Country c1=new Country();
		c1.setCountryName("USA");
		c1.setContinent("AMERICAS");
		c1.setCountryCode("2");
		// TODO Auto-generated method stub
		List<Country> resultList =new ArrayList<Country>();
		resultList.add(c);
		resultList.add(c1);
		List<Country> countryList=resultList;
		return countryList;
	}

}
