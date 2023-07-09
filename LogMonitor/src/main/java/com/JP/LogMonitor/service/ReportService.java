package com.JP.LogMonitor.service;

import com.JP.LogMonitor.DTO.SearchReqInfo;
import com.JP.LogMonitor.entity.UserInfo;

import java.util.List;

public interface ReportService {

    public List<String> getPlanNames();

    public List<String> getPlanStatus();

    public List<UserInfo> search(SearchReqInfo searchReqInfo);

    public boolean exportExcel();

    public boolean exportPdf();
}
