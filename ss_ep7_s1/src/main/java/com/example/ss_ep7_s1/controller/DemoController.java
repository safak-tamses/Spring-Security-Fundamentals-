package com.example.ss_ep7_s1.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/demo")
    @PreAuthorize("hasAnyAuthority('write')")
    public String demo(){
        return "Demp!";
    }
}
