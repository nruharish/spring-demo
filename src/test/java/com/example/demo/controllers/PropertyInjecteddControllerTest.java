package com.example.demo.controllers;

import com.example.demo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PropertyInjecteddControllerTest {

    @Autowired
    PropertyInjecteddController propertyInjecteddController;

    @Test
    void greet() {
        System.out.println(propertyInjecteddController.greet());
    }
}