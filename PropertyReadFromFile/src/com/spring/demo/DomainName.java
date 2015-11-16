package com.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class DomainName {

	private String domainName;

	public String getDomainName() {
		return domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	
	
}
