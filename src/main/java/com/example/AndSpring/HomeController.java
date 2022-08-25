package com.example.AndSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Slf4j
@Controller
public class HomeController {

    @ResponseBody
    @PostMapping(value = "/android")
    public String androidResponse(@RequestBody User user) {

        log.info("username = {}, password = {}", user.getId(), user.getPassword());

        return "ok";
    }
}

