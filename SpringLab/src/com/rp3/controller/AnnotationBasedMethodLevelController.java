package com.rp3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnnotationBasedMethodLevelController {

	@RequestMapping("/simple")
	public ModelAndView simple() {
		
		ModelAndView m = new ModelAndView("login");
		
		m.addObject("msg", "This is simple method level annotation based comtroller! ");
		
		return m;
	}

	
	@RequestMapping("/simple/path")
	public ModelAndView byPath() {
		ModelAndView m = new ModelAndView("login");
		
		m.addObject("msg", "This is simple method level annotation based comtroller! ");
		
		return m;
	}
}
