package com.samuel.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	
	@RequestMapping("/welcome/{countryname}/{username}")
	public ModelAndView HelloWorld(@PathVariable Map<String, String> pathVar) {
		String name= pathVar.get("username");
		String countryname=pathVar.get("countryname");
		ModelAndView modelandview= new ModelAndView("hello");
		modelandview.addObject("WelcomeMessage", "Hello User, "+name+" You are from "+countryname);
		return modelandview;
		
	}
	
	@RequestMapping("/hi")
	public ModelAndView Hi() {
		ModelAndView modelandview= new ModelAndView("hello");
		modelandview.addObject("WelcomeMessage", "Hello User2");
		return modelandview;
		
	}

	
	


}
