package com.example.practice.dao;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="CRICKET_PLAYERS")
public class CricketPlayers {

    @EmbeddedId
    PlayerDetails playerDetails;

    @Column(name="PLACE")
    private String place;

    @Column(name="ACTIVE")
    private Character active;

    @Column(name="Mobile_Number")
    private Long mobileNumber;

    @Column(name="SALARY",nullable = false)
    private Integer salary;

}
