package com.javaminions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping(value= {"", "/", "home"})
	public ModelAndView goHome(ModelAndView mv) {
		mv.setViewName("home");
		
		return mv;
	}
	
	/*
	 * TEMP CODE PLZ REMOVE
	 */
	@RequestMapping("temp")
	public ModelAndView temp(ModelAndView mv) {
		mv.setViewName("SupplierWorld");
		return mv;
	}
}
