package com.example.AndSpring.basic.controller;

import com.example.AndSpring.basic.Entity.Bloodsugar;
import com.example.AndSpring.basic.Entity.Pulse;
import com.example.AndSpring.basic.Entity.Temperature;
import com.example.AndSpring.basic.Entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
@Slf4j
@RestController
public class UserController {

    @PostMapping(value = "/android")
    public String androidResponse(@RequestBody User user) {

        log.info("id = {}, password = {}", user.getUserName(), user.getUserPhone());

        return "ok";
    }

    @PostMapping(value = "/body-data")
    public String androidData(@RequestBody User user, Pulse pulse, Temperature temperature, Bloodsugar bloodsugar) {
        log.info("pulse_data = {}, temperature_data = {}, blood_sugar_data = {}"
                , pulse.getPulseData(), temperature.getTemperatureData(), bloodsugar.getBloodsugarData());

        return "ok";
    }
}

