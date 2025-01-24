package com.example.demo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String greet(){
        System.out.println("In the controller");
        return "Hello everyone";
    }
}
