package com.dreamteam.statistics.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
import com.dreamteam.statistics.response.*;
import com.dreamteam.statistics.model.*;

import com.dreamteam.statistics.services.EffectifService;

@RequestMapping("/statistics")
@RestController
public class EffectifController {

    @Autowired
    private EffectifService effectifService;

    @GetMapping("/effectif/getAll")
    public Response listes(){ 
        return null;
    }

    @PostMapping("/effectif/insert")
    public void insert(@RequestBody Effectif effectif) throws Exception {

        // if (effectif != null) {
        //     this.effectifService.saveEffectif(effectif);
        // } 
    }
}
