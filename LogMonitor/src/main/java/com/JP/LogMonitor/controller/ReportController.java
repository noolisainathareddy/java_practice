package com.JP.LogMonitor.controller;


import com.JP.LogMonitor.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
