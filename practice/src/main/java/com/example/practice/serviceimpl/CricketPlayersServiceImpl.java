package com.example.practice.serviceimpl;

import com.example.practice.dao.CricketPlayers;
import com.example.practice.dao.PlayerDetails;
import com.example.practice.repo.CricketPlayersRepo;
import com.example.practice.service.CricketPlayersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CricketPlayersServiceImpl implements CricketPlayersService {


    @Autowired
    CricketPlayersRepo cricketPlayersRepo;
    @Override
    public void addPlayer(CricketPlayers cricketPlayers) {
        cricketPlayersRepo.save(cricketPlayers);
    }

    @Override
    public Optional<CricketPlayers> retrieveRec(Integer id, String name, Integer age) {
        PlayerDetails playerDetails=new PlayerDetails(id, name, age);
        Optional<CricketPlayers> cricketPlayers = cricketPlayersRepo.findById(playerDetails);
        log.trace("This is trace");
        log.debug("This is debug");
        log.info("This is info");
        log.warn("This is warn");
        log.error("This is error");

        return cricketPlayers;


    }
}
