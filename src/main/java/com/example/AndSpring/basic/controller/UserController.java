package com.example.AndSpring.basic.controller;

import com.example.AndSpring.basic.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
public class UserController {

    @PostMapping(value = "/android")
    public String androidResponse(@RequestBody User user) {

        log.info("id = {}, password = {}", user.getId(), user.getPassword());

        return "ok";
    }

    @PostMapping(value = "/body-data")
    public String androidData(@RequestBody User user) {
        log.info("pulse_data = {}, temperature_data = {}, blood_sugar_data = {}"
                , user.getPulse_data(), user.getTemperature_data(), user.getBlood_sugar_data());

        return "ok";
    }
}

