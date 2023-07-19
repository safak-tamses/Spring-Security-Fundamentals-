package com.example.ss_ep6_s1.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/demo")
    public String demo(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();


        return "hello " + authentication.getName() + " welcome";
    }
    @GetMapping("/test")
    public String test(){
        return "test!";
    }
}
