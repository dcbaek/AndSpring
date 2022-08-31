package com.example.AndSpring.basic.domain;

import lombok.Data;

@Data
public class User {

    private String id;

    private String password;

    private String pulse_data;

    private String temperature_data;

    private String blood_sugar_data;
}