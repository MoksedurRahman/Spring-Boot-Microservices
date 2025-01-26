package com.datavisionbd.microservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hello")
    public String helloUser(){
        return "Hello User Controller";
    }

    @GetMapping("/user1")
    public String user1User(){
         return "user 1 controller ";
    }

}
