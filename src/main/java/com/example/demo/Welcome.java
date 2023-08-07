package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/hi")
    public void getnotes() {
        System.out.println("Welcome to cicd pipeline");
    }
}
