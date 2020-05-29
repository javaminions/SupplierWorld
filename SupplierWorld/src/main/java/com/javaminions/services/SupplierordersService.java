package com.javaminions.services;

import org.springframework.stereotype.Service;

import com.javaminions.pojos.SupplierordersList;
import com.javaminions.repos.SupplierordersRepo;

@Service
public class SupplierordersService {
	
	public static SupplierordersList getAllOrders(SupplierordersRepo sRepo) {
		SupplierordersList sList = new SupplierordersList();
		sList.setOrders(sRepo.findAll());
		return sList;
	}

}
