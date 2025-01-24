package com.example.demo.controllers;

import com.example.demo.services.GreetingService;

public class PropertyInjecteddController {
    GreetingService greetingService;

    public String greet(){
        return greetingService.sayGreeting();
    }
}
