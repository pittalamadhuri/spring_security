package com.learning.spring_security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortfolioController {

    @GetMapping("/")
    public String portfolio() {
        return "Welcome to Crypto Portfolio";
    }
}
