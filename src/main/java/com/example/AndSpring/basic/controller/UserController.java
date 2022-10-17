package com.example.AndSpring.basic.controller;

import com.example.AndSpring.basic.Entity.Bloodsugar;
import com.example.AndSpring.basic.Entity.Pulse;
import com.example.AndSpring.basic.Entity.Temperature;
import com.example.AndSpring.basic.Entity.User;
import com.example.AndSpring.basic.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(value = "/android")
    public String androidResponse(@RequestBody User user) {

        log.info("username = {}, password = {}", user.getUsername(), user.getPassword());

        return "ok";
    }

    @PostMapping(value = "/pulse-data")
    public String androidPulseData(@RequestBody Pulse pulse) {
        log.info("pulseData = {}"
                , pulse.getPulseData());

        return "ok";
    }

    @PostMapping(value = "/temperature-data")
    public String androidTemperatureData(@RequestBody Temperature temperature) {
        log.info("temperatureData = {}"
                , temperature.getTemperatureData());

        return "ok";
    }

    @PostMapping(value = "/bloodsugar-data")
    public String androidBloodsugarData(@RequestBody Bloodsugar bloodsugar) {
        log.info("bloodsugarData = {}"
                , bloodsugar.getBloodsugarData());

        return "ok";
    }

    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<List<User>> getAlluser() {
        List<User> user = userService.findAll();
        return new ResponseEntity<List<User>>(user, HttpStatus.OK);

    }

    @GetMapping("/{userId}")
    public ResponseEntity<User> getUser(@PathVariable("userId") Long userId) {
        Optional<User> user = userService.findById(userId);
        return new ResponseEntity<User>(user.get(), HttpStatus.OK   );
    }

    @DeleteMapping(value = "/{userId}")
    public ResponseEntity<Void> deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteById(userId);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/saveUser")
    public ResponseEntity<User> save(HttpServletRequest request, User user) {
        return new ResponseEntity<User>(userService.save(user), HttpStatus.OK);
    }
}

