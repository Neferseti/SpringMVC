package org.mks.webapp.controller;

import org.mks.webapp.entity.StudentEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmissionForm() {
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}

	@RequestMapping(value = "submitAdmissionForm.html", method = RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam("studentName") String name,
			@RequestParam("studentHobby") String hobby) {
		
		StudentEntity student1= new StudentEntity();
		student1.setStudentName(name);
		student1.setStudentHobby(hobby);
		
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("headerMessage", "Welcome!");
		modelAndView.addObject("student1", student1);
		return modelAndView;
	}
}
