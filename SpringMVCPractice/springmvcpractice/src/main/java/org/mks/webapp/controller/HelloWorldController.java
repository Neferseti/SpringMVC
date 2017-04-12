package org.mks.webapp.controller;

import org.springframework.stereotype.Controller;
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
	
	@RequestMapping("hi")
	public ModelAndView hiWorld(){
		ModelAndView modelAndView = new ModelAndView("HelloWorldPage");
		modelAndView.addObject("welcomeMessage", "Hi World");
		return modelAndView;
	}

}
