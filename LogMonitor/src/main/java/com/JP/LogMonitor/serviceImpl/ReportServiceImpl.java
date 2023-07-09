package com.JP.LogMonitor.serviceImpl;

import com.JP.LogMonitor.DTO.SearchReqInfo;
import com.JP.LogMonitor.entity.UserInfo;
import com.JP.LogMonitor.repository.UploadData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements com.JP.LogMonitor.service.ReportService {

    @Autowired
    private UploadData uploadData;

    @Override
    public List<String> getPlanNames() {
        List<String> uniquePlans= uploadData.uniquePlans();
        return uniquePlans;
    }

    @Override
    public List<String> getPlanStatus() {
        List<String> uniqueStatus = uploadData.uniquePlanStatus();
        return uniqueStatus;
    }

    @Override
    public List<UserInfo> search(SearchReqInfo info) {
        return null;
    }

    @Override
    public boolean exportExcel() {
        return false;
    }

    @Override
    public boolean exportPdf() {
        return false;
    }
}
