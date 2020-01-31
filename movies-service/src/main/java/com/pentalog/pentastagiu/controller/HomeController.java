package com.pentalog.pentastagiu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/home")
    public String getHomePageMessage() {
        return "Hello from REST!";
    }
}
