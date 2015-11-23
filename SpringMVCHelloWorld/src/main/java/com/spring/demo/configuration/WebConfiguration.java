package com.spring.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.spring.demo")
public class WebConfiguration {

	@Bean(name="HelloWorld")
	public ViewResolver getViewResolver(){
		InternalResourceViewResolver resourveViewResolver=new InternalResourceViewResolver();
		resourveViewResolver.setViewClass(JstlView.class);
		resourveViewResolver.setPrefix("WEB-INF/views/");
		resourveViewResolver.setSuffix(".jsp");
		return resourveViewResolver;
	}
	
}
