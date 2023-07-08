package com.JP.LogMonitor.repository;

import com.JP.LogMonitor.entity.DataKey;
import com.JP.LogMonitor.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadData extends JpaRepository<UserInfo, DataKey> {
}
