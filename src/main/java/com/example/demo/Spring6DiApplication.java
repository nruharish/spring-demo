package com.example.demo;

import com.example.demo.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Spring6DiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(Spring6DiApplication.class, args);
		MyController ctr = ctx.getBean(MyController.class);
		System.out.println(ctr.greet());
	}

}
