package com.example.demo.controllers;

import com.example.demo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PropertyInjecteddControllerTest {

    PropertyInjecteddController propertyInjecteddController;
    @BeforeEach
    void setUp() {
        propertyInjecteddController = new PropertyInjecteddController();
        propertyInjecteddController.greetingService = new GreetingServiceImpl();
    }

    @Test
    void greet() {
        System.out.println(propertyInjecteddController.greet());
    }
}