package com.JP.LogMonitor.controller;

import com.JP.LogMonitor.service.UpdateDBService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class updateDB {

    @Autowired
    private UpdateDBService updateDBService;
    @PostMapping("/updateDb")
    public void updateDbViaFile(){
        log.info("Running updateDbViaFile method");
        updateDBService.updateData();
        log.info("Successfully completed");
    }
}
