package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    private String message = "hello my  world ";

    private String SDN = "new SDN";

    private String auth ="This is auth changes";

    private String stash2 ="This is stash 2 ";


    private String development ="This is a string added at local to merge to remote";
    
    @GetMapping("/welcome")
    public String welcome()

    {

        return message;
    }





}
