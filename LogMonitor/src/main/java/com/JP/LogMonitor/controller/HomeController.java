package com.JP.LogMonitor.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HomeController {

    @GetMapping("/greet")
    public ResponseEntity<String> greet(){
        log.info("Started executing Greet method");
        int a = 4;
        log.info("Completed execution");
        return new ResponseEntity<>("Welcome to Logging app", HttpStatus.OK);
    }
}
