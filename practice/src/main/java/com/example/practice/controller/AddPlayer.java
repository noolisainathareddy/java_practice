package com.example.practice.controller;

import com.example.practice.dao.CricketPlayers;
import com.example.practice.service.CricketPlayersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddPlayer {

    @Autowired
    CricketPlayersService cricketPlayersService;

    @PostMapping(value="/add",
    consumes = {"application/json", "application/xml"})
    public ResponseEntity<String> addRec(@RequestBody CricketPlayers cricketPlayers) {
        System.out.println(cricketPlayers);
       cricketPlayersService.addPlayer(cricketPlayers);
       String msg="added successfully";
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }


    @GetMapping(value="/getRec/{age}", produces = {"application/json"})
    public Optional<CricketPlayers> getRec(
            @RequestHeader(value="playerid") Integer playerId,
            @RequestHeader(value="name")String name,
            @PathVariable(value="age") Integer age){
            System.out.println(playerId + " " + name + " " + age);
            Optional<CricketPlayers> cricketPlayers = cricketPlayersService.retrieveRec(playerId, name, age);
            return cricketPlayers;
    }
}
