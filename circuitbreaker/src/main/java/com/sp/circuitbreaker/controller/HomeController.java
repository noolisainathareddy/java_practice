package com.sp.circuitbreaker.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    @CircuitBreaker(name = "data", fallbackMethod = "getDataFromDB")
    public ResponseEntity<String> getDataFromRedis(){
        String s = "Getting data from Redis";
        System.out.println("Calling redis");
        int i = 4/0;
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    public ResponseEntity<String> getDataFromDB(){
        String s = "Getting data from DB";
        System.out.println("Calling DB");
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

}
