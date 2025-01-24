package com.example.demo.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyControllerTest {

    @Test
    void greet() {
        MyController myController = new MyController();
        System.out.println(myController.greet());
    }
}