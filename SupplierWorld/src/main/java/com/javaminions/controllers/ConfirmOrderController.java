package com.javaminions.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaminions.services.ConfirmOrderService;

@Controller
public class ConfirmOrderController {

	@RequestMapping("confirmOrder")
	public String pickedOrder(@RequestParam int id, @RequestParam int quantity) {
		return ConfirmOrderService.confirmOrder(id, quantity);
	}
	
}
