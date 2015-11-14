package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStarter {

	public static void main(String[] args) {
		// this is java based spring configuration example with component scan
		ApplicationContext context = new AnnotationConfigApplicationContext(
				ApplicationConfiguration.class);

		// another way with XMl is as below
		/*
		 * ApplicationContext context=new
		 * ClassPathXmlApplicationContext("spring.xml"); CompactDisk diskObj=
		 * (CompactDisk) context.getBean("compactDisk");
		 */

		CDPlayer cdPlayerbj = context.getBean(CDPlayer.class);

		cdPlayerbj.play();
	}

}
