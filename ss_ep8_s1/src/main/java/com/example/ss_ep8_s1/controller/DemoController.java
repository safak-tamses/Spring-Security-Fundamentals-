package com.example.ss_ep8_s1.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/hello")
    public String hello(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        return "Hello " + authentication.getName() + " welcome";
    }
}
