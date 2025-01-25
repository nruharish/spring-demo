package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements  GreetingService{
    @Override
    public String sayGreeting() {
        return "Property Injection, avoid this!";
    }
}
