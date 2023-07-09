package com.JP.LogMonitor.DTO;

import lombok.Data;

import javax.persistence.Column;

@Data
public class SearchReqInfo {

    private String planName;

    private String planStatus;

    private String gender;

    private String planStartDate;

    private String planEndDate;
}


