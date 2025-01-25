package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service("setterInjected")
public class GreetingServiceSetterInjection implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Setting a greeting";
    }
}
