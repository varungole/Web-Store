package com.varun.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebMarketController {
    
    @GetMapping("/")
    public String hello()
    {
        return "Hello, World!";
    }
}
