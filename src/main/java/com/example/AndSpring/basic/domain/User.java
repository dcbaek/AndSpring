package com.example.AndSpring.basic.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;
    private String password;
    private String pulse_data;
    private String temperature_data;
    private String blood_sugar_data;

    public User() {
    }

    public User(String userName, String password, String pulse_data, String temperature_data, String blood_sugar_data) {
        this.userName = userName;
        this.password = password;
        this.pulse_data = pulse_data;
        this.temperature_data = temperature_data;
        this.blood_sugar_data = blood_sugar_data;
    }
}