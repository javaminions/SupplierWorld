package com.javaminions.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaminions.repos.SupplierordersRepo;
import com.javaminions.services.OrderReceptionistService;

@RestController
public class OrderReceptionistRestController {
	
	@Autowired
	SupplierordersRepo ordersRepo;

	@RequestMapping("neworder/{id}/{quantity}")
	@ResponseBody
	public String makeNewOrder(@PathVariable int id, @PathVariable int quantity) {
		return OrderReceptionistService.createNewOrder(id, quantity, ordersRepo);
	}
	
	

	
}
