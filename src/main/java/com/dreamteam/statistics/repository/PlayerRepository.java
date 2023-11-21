package com.dreamteam.statistics.repository;

import com.dreamteam.statistics.model.player.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, String>{

}