package com.JP.LogMonitor.serviceImpl;

import com.JP.LogMonitor.entity.DataKey;
import com.JP.LogMonitor.entity.UserInfo;
import com.JP.LogMonitor.repository.UploadData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.security.PrivateKey;
import java.util.*;

@Service
@Slf4j
public class UpdateDBServiceImpl implements com.JP.LogMonitor.service.UpdateDBService{

    @Autowired
    private UploadData uploadData;

    Set<UserInfo> set = new HashSet<>();
    public Set<UserInfo> readFile() throws Exception{
        File f = new File("/Users/sainooli/java_practice/LogMonitor/citizensData.txt");
        FileReader fr = new FileReader(f);
        BufferedReader bf = new BufferedReader(fr);
        String line = "";

        log.info("Reading file started");
        while((line = bf.readLine()) != null ){
            if(!line.startsWith("id")){
                UserInfo userInfo = new UserInfo();
                String[] data = line.split(",");
                log.info(Arrays.toString(data));
                Integer id = Integer.valueOf(data[0]);
                DataKey dataKey = new DataKey(id);
                userInfo.setDataKey(new DataKey(id));
                userInfo.setCitizenName(data[1]);
                userInfo.setPlanName(data[2]);
                userInfo.setPlanStatus(data[3]);
                userInfo.setGender(data[4]);
                userInfo.setPlanStartDate(data[5]);
                userInfo.setPlanEndDate(data[6]);
                userInfo.setBenefitAmount(Double.valueOf(data[7]));
                set.add(userInfo);

            }
        }
        log.info("Read file and returning value into SET");
        return set;
    }

    @Override
    public void updateData() {
        log.info("Entered into UpdateDBServiceImpl class");
        try{
            readFile();
        }
        catch(Exception e ){
            e.printStackTrace();
        }
        Iterator<UserInfo> iterator= set.iterator();
        while(iterator.hasNext()){
            uploadData.save(iterator.next());
        }
    }
}
