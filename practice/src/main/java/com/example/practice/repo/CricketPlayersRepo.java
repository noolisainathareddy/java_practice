package com.example.practice.repo;

import com.example.practice.dao.CricketPlayers;
import com.example.practice.dao.PlayerDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CricketPlayersRepo  extends JpaRepository<CricketPlayers, PlayerDetails> {



}
