package com.example.deploy_test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class HelloController {

    @GetMapping
    public String sample()
    {
        return "sample ishan reshmika";
    }
}
