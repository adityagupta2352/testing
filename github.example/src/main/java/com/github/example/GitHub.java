package com.github.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class GitHub {

    private Long id;

    private String name;

    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }
};
