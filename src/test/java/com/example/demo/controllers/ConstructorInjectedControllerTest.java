package com.example.demo.controllers;

import com.example.demo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());

    }

    @Test
    void greet() {
        System.out.println(constructorInjectedController.greet());
    }
}