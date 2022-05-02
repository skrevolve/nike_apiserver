package com.nike.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/test-docker")
    public String getData() {
        return "Docker Deploy 배포 테스트 완료";
    }
}
