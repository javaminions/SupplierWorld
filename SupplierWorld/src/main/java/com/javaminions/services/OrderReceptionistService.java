package com.javaminions.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaminions.pojos.Supplierorders;
import com.javaminions.repos.SupplierordersRepo;

@Service
public class OrderReceptionistService {

	public static String createNewOrder(int id, int quantity, SupplierordersRepo ordersRepo) {
		Supplierorders order = new Supplierorders();
		order.setProductcode(id);
		order.setQuantity(quantity);
		order.setStatus("NEW");
		
		ordersRepo.save(order);
		
		List<Supplierorders> allOrders = ordersRepo.findAll();
		Supplierorders temp = new Supplierorders();
		temp = allOrders.get(allOrders.size()-1);
		
		return "Order created with order id " + temp.getId();
	}
	
}
