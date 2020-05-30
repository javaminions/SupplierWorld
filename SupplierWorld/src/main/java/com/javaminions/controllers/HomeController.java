package com.javaminions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.javaminions.repos.SupplierordersRepo;
import com.javaminions.repos.SupplierstockRepo;
import com.javaminions.services.HomepageInitializer;

@Controller
public class HomeController {
	
	@Autowired
	SupplierordersRepo ordersRepo;
	
	@Autowired
	SupplierstockRepo stockRepo;

	@RequestMapping(value= {"", "/", "home"})
	public ModelAndView goHome(ModelAndView mv) {
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView temp(ModelAndView mv) {

		mv.addObject("neworders", HomepageInitializer.getNewOrders(ordersRepo));
		mv.addObject("orders", HomepageInitializer.getAllOrders(ordersRepo));
		mv.addObject("received", HomepageInitializer.getReceviedOrders(ordersRepo));
		mv.addObject("fulfilled", HomepageInitializer.getFulfilledOrders(ordersRepo));
		mv.addObject("products", HomepageInitializer.getAllStock(stockRepo));
		
		mv.setViewName("SupplierWorld");
		return mv;
	}
}
