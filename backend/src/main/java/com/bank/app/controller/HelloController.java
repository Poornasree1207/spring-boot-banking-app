package com.bank.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Banking Backend is running";

    }
}