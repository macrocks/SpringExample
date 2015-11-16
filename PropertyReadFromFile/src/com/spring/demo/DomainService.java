package com.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DomainService {

	@Autowired
	private DomainName domainName;
	
	@Autowired
	private Environment environment;
	
	public void getDomainName()
	{
		domainName.setDomainName(environment.getProperty("DomainName"));
		System.out.println(domainName.getDomainName());
	}
	
	
}
