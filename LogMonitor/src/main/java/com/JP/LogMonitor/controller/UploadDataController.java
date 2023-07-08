package com.JP.LogMonitor.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadDataController {

    public ResponseEntity<String> uploadDb(){
        return new ResponseEntity<>("Successfully updated data", HttpStatus.OK);
    }

}
