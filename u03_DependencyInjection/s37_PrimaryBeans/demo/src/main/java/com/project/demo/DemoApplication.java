package com.project.demo;

import com.project.demo.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);
		System.out.println("In Main Method");
		System.out.println(controller.sayHello());
	}

}
