package com.football.service;

import java.util.List;

import javax.ejb.Local;

import com.football.entity.LeagueType;
@Local
public interface LeagueService {
	
	public List<LeagueType> retriveAllLeagues();
	public void saveLeague(LeagueType league);
	public Integer findLeagueByName(String name);

}
