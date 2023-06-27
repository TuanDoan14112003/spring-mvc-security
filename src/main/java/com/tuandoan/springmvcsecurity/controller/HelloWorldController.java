package com.tuandoan.springmvcsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {
    @GetMapping("/")
    public String sayHello() {
        return "home";
    }
    @GetMapping("/leaders")
    public String leaders() {
        return "leaders";
    }
    @GetMapping("/systems")
    public String systems() {
        return "systems";
    }
}
