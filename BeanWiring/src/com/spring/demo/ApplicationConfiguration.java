package com.spring.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
//@ComponentScan will scan all beans with @component annotation and will create bean for them
//we can try @ComponentScan(basePackages={"com.spring.demo"}) too
public class ApplicationConfiguration {

}
