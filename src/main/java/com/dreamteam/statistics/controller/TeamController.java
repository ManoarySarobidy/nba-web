package com.dreamteam.statistics.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;


import com.dreamteam.statistics.model.player.Player;
import com.dreamteam.statistics.response.Response;
import com.dreamteam.statistics.repository.*;
import java.util.*;
@RestController
@RequestMapping("/api/team")
public class TeamController{

	@Autowired TeamRepository pl;

	@GetMapping
	public Response getTeams() throws Exception{
		List<Team> players = pl.findAll();
		return new Response().addData("teams" , players);
	}

	@GetMapping("/{id}")
	public Response getTeam( @PathVariable("id") String id ) throws Exception{
		return new Response();
	}

	@PostMapping
	public Response addPlayer( @RequestBody Player player ) throws Exception{
		return null;		
	}

}