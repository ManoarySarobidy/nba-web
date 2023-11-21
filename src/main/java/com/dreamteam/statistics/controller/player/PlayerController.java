package com.dreamteam.statistics.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;


import com.dreamteam.statistics.model.player.Player;
import com.dreamteam.statistics.response.Response;
import com.dreamteam.statistics.repository.*;
import java.util.*;
@RestController
@RequestMapping("/api/player")
public class PlayerController{

	@Autowired PlayerRepository pl;

	@GetMapping
	public Response getPlayers() throws Exception{
		// Player[] player = Player.getPlayersTable();
		List<Player> players = pl.findAll();
		// System.out.println("taille == " + player.length);
		return new Response().addData("players" , players);
	}

	@PostMapping
	public Response addPlayer( @RequestBody Player player ) throws Exception{
		return null;		
	}

}