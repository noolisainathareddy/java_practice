package com.JP.LogMonitor.controller;


import com.JP.LogMonitor.DTO.SearchReqInfo;
import com.JP.LogMonitor.entity.UserInfo;
import com.JP.LogMonitor.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReportController {

    @Autowired
    private ReportService reportService;

    @GetMapping("/getUniquePlans")
    public void getUniquePlans(){
        List<String> names = reportService.getPlanNames();

        for(String n: names){
            System.out.println(n);
        }
    }

    @GetMapping("/getUniqueStatus")
    public void getUniquePlanStatus(){
        List<String> status = reportService.getPlanStatus();
        for(String s:status){
            System.out.println(s);
        }
    }


    @PostMapping("/getData")
    public ResponseEntity<List<UserInfo>> searchResult(@RequestBody SearchReqInfo searchReqInfo){
        System.out.println(searchReqInfo);
        List<UserInfo> list = reportService.search(searchReqInfo);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

}
