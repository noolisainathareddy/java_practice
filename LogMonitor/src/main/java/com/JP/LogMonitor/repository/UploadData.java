package com.JP.LogMonitor.repository;

import com.JP.LogMonitor.entity.DataKey;
import com.JP.LogMonitor.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UploadData extends JpaRepository<UserInfo, DataKey> {

    @Query(value = "select distinct(plan_name) from user_info", nativeQuery = true)
    public List<String> uniquePlans();

    @Query(value = "select distinct(plan_status) from user_info", nativeQuery = true)
    public List<String> uniquePlanStatus();

}
