package com.example.AndSpring;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
@Slf4j
@Controller
public class HomeController {

    @PostMapping(value = "/android")
    @ResponseBody
    public String androidResponse(@RequestBody User user) {

        log.info("info log = {}", user);

        return "ok";
    }
}

