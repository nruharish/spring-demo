package com.example.demo.controllers;

import com.example.demo.services.GreetingService;

public class SetterInjectedController {

    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String greet(){
        return greetingService.sayGreeting();
    }
}
