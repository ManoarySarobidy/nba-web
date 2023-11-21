package com.dreamteam.statistics.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;


import com.dreamteam.statistics.model.player.Player;
import com.dreamteam.statistics.response.Response;
import com.dreamteam.statistics.repository.*;

@RestController
@RequestMapping("/api/player")
public class PlayerController{


	@GetMapping
	public Response getPlayers() throws Exception{
		Player[] player = Player.getPlayersTable();
		System.out.println("taille == " + player.length);
		return new Response().addData("players" , player);
	}

	@PostMapping
	public Response addPlayer( @RequestBody Player player ) throws Exception{
		return null;		
	}

}