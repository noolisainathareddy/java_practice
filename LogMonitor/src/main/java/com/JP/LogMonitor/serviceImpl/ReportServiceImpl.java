package com.JP.LogMonitor.serviceImpl;

import com.JP.LogMonitor.DTO.SearchReqInfo;
import com.JP.LogMonitor.entity.UserInfo;
import com.JP.LogMonitor.repository.UploadData;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
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
    public List<UserInfo> search(SearchReqInfo searchReqInfo) {
        UserInfo data = new UserInfo();
        if(searchReqInfo.getPlanName() != null && searchReqInfo.getPlanName() != ""){
            data.setPlanName(searchReqInfo.getPlanName());
        }
        if(searchReqInfo.getPlanStatus() != null && searchReqInfo.getPlanStatus() != ""){
            data.setPlanStatus(searchReqInfo.getPlanStatus());
        }
        if(searchReqInfo.getGender() != null && searchReqInfo.getGender() != ""){
            data.setGender(searchReqInfo.getGender());
        }
        System.out.println(data);
        return uploadData.findAll(Example.of(data));
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
