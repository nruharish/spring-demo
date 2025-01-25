package com.example.demo.controllers;

import com.example.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {


    private GreetingService greetingService;


    @Autowired
    @Qualifier("setterInjected")
    public void setGreetingService(GreetingService greetingService) {
        System.out.println("In the setter....");
        this.greetingService = greetingService;
    }

    public String greet(){
        return greetingService.sayGreeting();
    }
}
