package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String message = "hello my  world ";

    private String SDN = "new SDN";


    @GetMapping("/welcome")
    public String welcome()

    {

        return message;
    }





}
