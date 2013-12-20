package com.rp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rp3.entity.MstUserInfo;
import com.rp3.service.MstUserInfoService;

@Controller
public class LoginController {
	
	@Autowired
	MstUserInfoService userInfoService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST) 
	public ModelAndView authenticateUser() {
		System.out.println(" Authenticate User ... ");
		ModelAndView mv = new ModelAndView("home");
		
		//org.springframework.web.servlet.DispatcherServlet ds = new DispatcherServlet();
		
		MstUserInfo userInfo = new MstUserInfo();
		
		userInfo.setUserId("171");
		//userInfo.setFirstName("Raju");
		//userInfo.setLastName("Patel");
		userInfo.setPassword("admin");
		/*
		userInfoService.addUser(userInfo);*/
		
		boolean isValidUser = userInfoService.authenticateUser(userInfo);
		
		if(isValidUser){
			System.out.println("User authentication successful!");
			mv.addObject("msg", "User authentication successful!");
		}else{
			System.out.println("Invalid user!");
			mv.addObject("msg", "Invalid user!");
		}
		
		return mv;
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
