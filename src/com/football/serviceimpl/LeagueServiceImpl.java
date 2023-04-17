package com.football.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;


import com.football.entity.LeagueType;
import com.football.service.LeagueService;

@Stateless
public class LeagueServiceImpl implements LeagueService {

	
	@Override
	public List<LeagueType> retriveAllLeagues() {
		// TODO Auto-generated method stub
		LeagueType l1=new LeagueType();
		l1.setLeagueId(1);
		l1.setLeagueCountry("INDIA");
		l1.setLeagueName("ISL");
		l1.setAliasName("PL");
		
		LeagueType l2=new LeagueType();
		l2.setLeagueId(2);
		l2.setLeagueCountry("USA");
		l2.setLeagueName("USL");
		l2.setAliasName("UPL");
		List<LeagueType> leagueList=new ArrayList<LeagueType>();
		leagueList.add(l1);
		leagueList.add(l2);
		
		return leagueList;
	}

	@Override
	public void saveLeague(LeagueType league) {
		// TODO Auto-generated method stub
  
	}

	@Override
	public Integer findLeagueByName(String name) {
		// TODO Auto-generated method stub
	return	0;
	}

}
