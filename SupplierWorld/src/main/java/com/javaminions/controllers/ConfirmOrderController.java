package com.javaminions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.javaminions.repos.SupplierordersRepo;
import com.javaminions.repos.SupplierstockRepo;
import com.javaminions.services.ConfirmOrderService;
import com.javaminions.services.HomepageInitializer;
import com.javaminions.services.UpdateService;

@Controller
public class ConfirmOrderController {
	
	@Autowired 
	SupplierordersRepo orders;
	
	@Autowired
	SupplierstockRepo stock;

	@RequestMapping("confirmOrder")
	public ModelAndView pickedOrder(ModelAndView mv, @RequestParam int orderid, @RequestParam int quantity, @RequestParam int id) {
		mv.setViewName("SupplierWorld");
		String confirmation = ConfirmOrderService.confirmOrder(id, quantity);
		String finalUpdate = "";
		if(confirmation!=null && confirmation.isEmpty()==false) {
			finalUpdate = UpdateService.updateStockAndOrderStatus(orders, stock, orderid, id, quantity);
		}
		if(finalUpdate.isEmpty()) {
			finalUpdate = null;
		}
		mv.addObject("finalUpdate", finalUpdate);
		
		mv.addObject("neworders", HomepageInitializer.getNewOrders(orders));
		mv.addObject("orders", HomepageInitializer.getAllOrders(orders));
		mv.addObject("received", HomepageInitializer.getReceviedOrders(orders));
		mv.addObject("fulfilled", HomepageInitializer.getFulfilledOrders(orders));
		mv.addObject("products", HomepageInitializer.getAllStock(stock));
		System.out.println("Orderid=" + orderid + " + quantity=" + quantity + " id="+id);
		return mv;
	}
	
}
