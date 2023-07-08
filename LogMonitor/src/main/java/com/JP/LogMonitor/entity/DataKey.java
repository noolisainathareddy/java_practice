package com.JP.LogMonitor.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DataKey implements Serializable {

    @Column(name="CITIZEN_ID")
    private Integer citizenId;
}
