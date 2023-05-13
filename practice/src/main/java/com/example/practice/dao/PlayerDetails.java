package com.example.practice.dao;



import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlayerDetails {

    @Column(name="PLAYER_ID", nullable = false)
    private Integer playerId;

    @Column(name="NAME",nullable = false)
    private String name;

    @Column(name="AGE",nullable = false)
    private Integer age;
}
