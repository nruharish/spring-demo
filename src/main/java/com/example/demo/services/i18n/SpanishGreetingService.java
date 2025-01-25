package com.example.demo.services.i18n;

import com.example.demo.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.awt.*;
@Profile("ES")
@Service("i18nService")
public class SpanishGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hola Mundo - ES";
    }
}
