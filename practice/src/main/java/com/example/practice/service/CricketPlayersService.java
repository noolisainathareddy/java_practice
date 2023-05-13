package com.example.practice.service;

import com.example.practice.dao.CricketPlayers;
import com.example.practice.dao.PlayerDetails;

import java.util.Optional;

public interface CricketPlayersService {
    void addPlayer(CricketPlayers cricketPlayers);

    Optional<CricketPlayers> retrieveRec(Integer id, String name, Integer age);
}
