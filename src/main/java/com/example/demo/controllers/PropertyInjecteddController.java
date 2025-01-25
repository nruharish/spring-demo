package com.example.demo.controllers;

import com.example.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjecteddController {
    @Qualifier("propertyGreetingService")
    @Autowired
    GreetingService greetingService;

    public String greet(){
        return greetingService.sayGreeting();
    }
}
