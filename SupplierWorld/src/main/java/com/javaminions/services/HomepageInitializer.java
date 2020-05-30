package com.javaminions.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.javaminions.pojos.Supplierorders;
import com.javaminions.pojos.Supplierstock;
import com.javaminions.repos.SupplierordersRepo;
import com.javaminions.repos.SupplierstockRepo;

@Service
public class HomepageInitializer {
	
	public static List<Supplierorders> getAllOrders(SupplierordersRepo ordersRepo){
		List<Supplierorders> allOrders = ordersRepo.findAll();
		if(allOrders.size()==0) {
			return null;
		} else {
			return allOrders;
		}
	}
	
	
	public static List<Supplierorders> getNewOrders(SupplierordersRepo ordersRepo) {
		List<Supplierorders> orders = ordersRepo.findAll();
		List<Supplierorders> newOrders = new ArrayList<Supplierorders>();
		
		for (Supplierorders s : orders) {
			if(s.getStatus().equalsIgnoreCase("new")) {
				newOrders.add(s);
			}
		}
		
		if(newOrders.size()==0) {
			return null;
		} else {
			return newOrders;
		}
		
	}
	
	public static List<Supplierorders> getReceviedOrders(SupplierordersRepo ordersRepo){
		List<Supplierorders> orders = ordersRepo.findAll();
		List<Supplierorders> receivedOrders = new ArrayList<Supplierorders>();
		for (Supplierorders s : orders) {
			if(s.getStatus().equalsIgnoreCase("RECEIVED")) {
				receivedOrders.add(s);
			}
		}
		
		if(receivedOrders.size()==0) {
			return null;
		} else {
			return receivedOrders;
		}
	}
	
	public static List<Supplierorders> getFulfilledOrders(SupplierordersRepo ordersRepo){
		List<Supplierorders> orders = ordersRepo.findAll();
		List<Supplierorders> fulfilledOrders = new ArrayList<Supplierorders>();
		for (Supplierorders s : orders) {
			if(s.getStatus().equalsIgnoreCase("fulfilled")) {
				fulfilledOrders.add(s);
			}
		}
		
		if(fulfilledOrders.size()==0) {
			return null;
		} else {
			return fulfilledOrders;
		}
	}
	
	public static List<Supplierstock> getAllStock(SupplierstockRepo stockRepo){
		List<Supplierstock> products = stockRepo.findAll();
		
		if(products.size()==0) {
			return null;
		} else {
			return products;
		}
	}

}
