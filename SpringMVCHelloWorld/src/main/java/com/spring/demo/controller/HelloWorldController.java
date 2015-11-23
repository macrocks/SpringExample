package com.spring.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloWorldController {

	@RequestMapping(method=RequestMethod.GET)
	public String HelloWorld(ModelMap model)
	{
		
		model.addAttribute("greeting","hellow orld from Spring 4 Web MVC project");
		return "welcome";
	}
	
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String HelloWorldAgain(ModelMap model)
	{
		
		model.addAttribute("greeting","helloworld Again from Spring 4 Web MVC project");
		return "welcome";
	}
	
}
