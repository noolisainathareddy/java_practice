package com.JP.LogMonitor.entity;

import lombok.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "USER_INFO")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserInfo {

    @EmbeddedId
    private DataKey dataKey;
    @Column
    private String citizenName;
    @Column
    private String planName;
    @Column
    private String planStatus;
    @Column
    private String gender;
    @Column
    private String planStartDate;
    @Column
    private String planEndDate;
    @Column
    private Double benefitAmount;


}
