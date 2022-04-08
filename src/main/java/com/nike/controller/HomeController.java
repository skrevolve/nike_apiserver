package com.nike.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping("/test-docker")
    public String getData() {
        return "in docker tutorial project of play java";
    }
}
