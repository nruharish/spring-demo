package com.example.demo.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;
@ActiveProfiles("ES")
@SpringBootTest
class Myi18nControllerTest {

    @Autowired
    Myi18nController myi18nController;

    @Test
    void greet(){
        System.out.println(myi18nController.greet());

    }

}