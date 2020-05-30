package com.javaminions.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javaminions.repos.SupplierordersRepo;
import com.javaminions.repos.SupplierstockRepo;
import com.javaminions.repos.SupplieruserRepo;
import com.javaminions.services.HomepageInitializer;
import com.javaminions.services.LoginService;

@Controller
public class HomeController {
	
	@Autowired
	SupplierordersRepo ordersRepo;
	
	@Autowired
	SupplierstockRepo stockRepo;
	
	@Autowired
	SupplieruserRepo users;
	
	boolean signedin;
	String message;
	
	@RequestMapping(value= {"", "/", "home"})
	public ModelAndView goHome(ModelAndView mv, HttpServletRequest request) {
		message = "";
		request.setAttribute("message", message);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("login")
	public ModelAndView temp(ModelAndView mv, @RequestParam String username, @RequestParam String password, HttpServletRequest request,
			HttpServletResponse response) {

		signedin = new LoginService().loginUser(request, response, username, password, users);
		
		if (signedin == true) {
		
		mv.addObject("neworders", HomepageInitializer.getNewOrders(ordersRepo));
		mv.addObject("orders", HomepageInitializer.getAllOrders(ordersRepo));
		mv.addObject("received", HomepageInitializer.getReceviedOrders(ordersRepo));
		mv.addObject("fulfilled", HomepageInitializer.getFulfilledOrders(ordersRepo));
		mv.addObject("products", HomepageInitializer.getAllStock(stockRepo));
		
		mv.setViewName("SupplierWorld");
		}
		
		else {
			message = "Please try again";
			request.setAttribute("message", message);
			mv.setViewName("home");
		}
		return mv;
	}
}
