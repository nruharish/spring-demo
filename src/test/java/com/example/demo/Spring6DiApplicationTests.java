package com.example.demo;

import com.example.demo.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Spring6DiApplicationTests {

	@Autowired
	ApplicationContext ctx;

	@Autowired
	MyController myController;

	@Test
	void testAutoWiredCtrl(){
		System.out.println("In test Autowired");
		System.out.println(myController.greet());
	}
	@Test
	void testGetControllerFromCtx(){
		System.out.println("In test");
		MyController myController = ctx.getBean(MyController.class);
		System.out.println(myController.greet());
	}
	@Test
	void contextLoads() {
	}

}
