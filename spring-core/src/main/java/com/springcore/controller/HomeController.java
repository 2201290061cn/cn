package com.springcore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    //web接口 handler
    public String home() {
        return "welcome Springboot";
    }
}
