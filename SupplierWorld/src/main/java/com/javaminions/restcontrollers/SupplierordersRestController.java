package com.javaminions.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaminions.pojos.SupplierordersList;
import com.javaminions.repos.SupplierordersRepo;
import com.javaminions.services.SupplierordersService;

@RestController
public class SupplierordersRestController {
	
	@Autowired
	SupplierordersRepo sRepo;
	
	@RequestMapping("getfulfillments")
	public SupplierordersList getAllOrders() {
		SupplierordersList sList = new SupplierordersList();
		sList = SupplierordersService.getAllOrders(sRepo);
		return sList;
	}

}