package com.bank.app.controller;

import org.springframework.web.bind.annotation.*;

@RestController //handles HTTP requests
public class HelloController {

    @GetMapping("/health") //is a endpoint used for service health monitoring
    public String healthCheck() {
        return "Banking Backend is running";

    }
}