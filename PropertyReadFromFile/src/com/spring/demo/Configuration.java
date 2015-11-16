package com.spring.demo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@org.springframework.context.annotation.Configuration
@ComponentScan
@PropertySource("classpath:project.properties")
public class Configuration {

}
