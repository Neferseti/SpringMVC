package org.mks.webapp.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/greet")
public class HelloWorldController {

	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView modelAndView = new ModelAndView("HelloWorldPage");
		modelAndView.addObject("welcomeMessage", "Hello World");
		return modelAndView;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hiWorld(){
		ModelAndView modelAndView = new ModelAndView("HelloWorldPage");
		modelAndView.addObject("welcomeMessage", "Hi World");
		return modelAndView;
	}

	@RequestMapping("/welcome/{username}")
	public ModelAndView helloUser(@PathVariable("username") String username){
		ModelAndView modelAndView = new ModelAndView("HelloWorldPage");
		modelAndView.addObject("welcomeMessage", "Hello "+username);
		return modelAndView;
	}
	
	@RequestMapping("/welcome/{username}/{country}")
	public ModelAndView helloUser(@PathVariable Map<String, String> pathVar){
		String username=pathVar.get("username");
		String country=pathVar.get("country");
		ModelAndView modelAndView = new ModelAndView("HelloWorldPage");
		modelAndView.addObject("welcomeMessage", "Hello "+username+". You are from "+country);
		return modelAndView;
	}
	
}
