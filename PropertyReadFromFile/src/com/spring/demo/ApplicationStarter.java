package com.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationStarter {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(Configuration.class);
		
		DomainService domainNameObj=context.getBean(DomainService.class);
		domainNameObj.getDomainName();
		
	}

}
