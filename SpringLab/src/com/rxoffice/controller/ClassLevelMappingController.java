package com.rxoffice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/classLevelMapping/*")
public class ClassLevelMappingController {
	
	@RequestMapping(value = "/SpringMVC/Login", method = RequestMethod.POST) 
	public String printHello(Model model) {
		// fill Model
		System.out.println(" Hello ... ");
		
		model.addAttribute("message", "Hello Spring MVC Framework!"); 
		
		return "Welcome";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@RequestMapping(value = "/searchJdbcContact", method = RequestMethod.GET)
	public ModelAndView searchContact() {
		ModelAndView mav = new ModelAndView("JdbcSearch");
		VngMem bean = new VngMem();

		mav.addObject("searchUserGet", bean);
		return mav;
	}

	@RequestMapping(value = "/searchJdbcContact", method = RequestMethod.POST)
	public ModelAndView searchContact(
			@ModelAttribute("searchlist2") VngMem vngmem) {
		ModelAndView mav = new ModelAndView("JdbcSearchResult");

		VngMem bean1 = null;
		try {
			bean1 = Service.searchMemDts(vngmem);
		} catch (Exception e) {
		}

		mav.addObject("searchResultPost", bean1);
		return mav;
	}


	@RequestMapping(value = "/insertJdbcContact", method = RequestMethod.GET)
	public ModelAndView insertMemDtls() {
		ModelAndView mav = new ModelAndView("JdbcInsert");

		VngMem bean = new VngMem();
		mav.addObject("insertUser", bean);
		mav.addObject("status", "success");
		return mav;
	}

	@RequestMapping(value = "/insertJdbcContact", method = RequestMethod.POST)
	public ModelAndView insertContact(
			@ModelAttribute("insertUser") VngMem vngmem) {
		ModelAndView mav = new ModelAndView("JdbcInsert");
		try {
			Service.insertMemDts(vngmem);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mav.addObject("searchResultPost", vngmem);
		return mav;
	}*/

}
