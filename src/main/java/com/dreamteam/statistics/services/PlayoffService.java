package com.dreamteam.statistics.services;

import org.springframework.stereotype.Service;
import com.dreamteam.statistics.repository.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.*;
@Service
public class PlayoffService {
    
    @Autowired
    private PlayoffRepository repository;

}
