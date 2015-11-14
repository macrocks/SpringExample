package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationStarter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);

		HelloWorld helloObj = context.getBean(HelloWorld.class);

		helloObj.setMessage("HelloWorld");
		helloObj.getMessage();

	}

}
