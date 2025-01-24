package com.example.demo.controllers;

import com.example.demo.services.GreetingService;
import com.example.demo.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String greet(){
        System.out.println("In the controller");
        return greetingService.sayGreeting();
    }
}
