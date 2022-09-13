package com.example.AndSpring.basic.repository;

import lombok.Data;

@Data
public class UserSearchCond {

    private String userName;
    private String password;
    private String pulse_data;
    private String temperature_data;
    private String blood_sugar_data;

    public UserSearchCond () {
    }

    public UserSearchCond(String userName, String password, String pulse_data, String temperature_data, String blood_sugar_data) {
        this.userName = userName;
        this.password = password;
        this.pulse_data = pulse_data;
        this.temperature_data = temperature_data;
        this.blood_sugar_data = blood_sugar_data;
    }
}