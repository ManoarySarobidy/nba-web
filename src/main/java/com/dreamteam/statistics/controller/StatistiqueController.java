package com.dreamteam.statistics.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;

import com.dreamteam.statistics.services.StatistiqueService;
import com.dreamteam.statistics.response.*;
import com.dreamteam.statistics.model.*;

@RequestMapping("/statistics")
@RestController
public class StatistiqueController {

    @Autowired
    private StatistiqueService statistiqueService;

    @GetMapping("/statistique/getAll")
    public Response listes(){ 
        return null;
    }

    @PostMapping("/statistique/insert")
    public void insert(@RequestBody Statistique statistique) throws Exception {

        // if (statistique != null) {
        //     this.statistiqueService.saveStatistique(statistique);
        // } 
    }
}
