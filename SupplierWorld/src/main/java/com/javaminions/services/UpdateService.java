package com.javaminions.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaminions.pojos.Supplierorders;
import com.javaminions.pojos.Supplierstock;
import com.javaminions.repos.SupplierordersRepo;
import com.javaminions.repos.SupplierstockRepo;

@Service
public class UpdateService {
	
	public static String updateStockAndOrderStatus(SupplierordersRepo o, SupplierstockRepo s, int orderid, int id, int quantity) {
		List<Supplierorders> orders = o.findAll();
		List<Supplierstock> allStock = s.findAll();
		
		
		
		Supplierorders order = new Supplierorders();
		for (Supplierorders oo : orders) {
			if(oo.getId()==orderid) {
				order = oo;
			}
		}
		
		order.setStatus("FULFILLED");
		o.save(order);
		
		//create boolean to check for order id exists, if not make else that creates new productID based on last + 1 
		boolean foundId = false;
		Supplierstock product = new Supplierstock();
		for (Supplierstock supplierstock : allStock) {
			if(supplierstock.getId()==id) {
				product=supplierstock;
				foundId = true;
			}
		}
		
		if(!foundId) {
			product.setId(id);
			product.setQuantity(1000);
		}
		
		product.setQuantity(product.getQuantity()-quantity);
		s.save(product);
		return "Updated order id"+order.getId()+ " status to FULFILLED. \nUpdated Product id" +product.getId()+ " with stock: "+product.getQuantity();
	}

}
