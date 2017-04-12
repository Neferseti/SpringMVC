package org.mks.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/welcome.html")
	public ModelAndView helloWorld(){
		ModelAndView modelAndView = new ModelAndView("HelloWorldPage");
		modelAndView.addObject("welcomeMessage", "Hello Mani! Welcome to the world of annotations");
		return modelAndView;
	}

}
