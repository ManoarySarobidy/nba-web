package com.dreamteam.statistics.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import com.dreamteam.statistics.services.PlayoffService;
import com.dreamteam.statistics.response.*;
import com.dreamteam.statistics.model.*;
@RequestMapping("/statistics")
@RestController
public class PlayoffController {

    @Autowired
    private PlayoffService playoffService;

    @GetMapping("/playoff/getAll")
    public Response listes(){ 
        return null;
    }

    @PostMapping("/playoff/insert")
    public void inscription(@RequestBody Playoff playoff) throws Exception {

        // if (playoff != null) {
        //     // this.playoffService.savePlayoff(playoff);
        // } 
    }
}
