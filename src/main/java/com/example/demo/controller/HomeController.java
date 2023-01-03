package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping("home")
    public  String home(){
        return "Hello world";
    }

    @GetMapping("user")
    public  String user(){
        return "Hello  user world";
    }

}
