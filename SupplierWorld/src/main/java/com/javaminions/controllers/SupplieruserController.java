package com.javaminions.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaminions.pojos.Supplieruser;
import com.javaminions.services.SupplieruserService;

@RestController
public class SupplieruserController {
	
	@Autowired
	private SupplieruserService service;
	
	@PostMapping("/addUser")
	public Supplieruser addSupplieruser(@RequestBody Supplieruser supplieruser) {
		return service.saveSupplieruser(supplieruser);
	}
	
	@PutMapping("/update")
	public Supplieruser updateSupplieruser(@RequestBody Supplieruser supplieruser) {
		return service.updateSupplieruser(supplieruser);
	}
	
	@DeleteMapping
	public String deleteSupplieruser(@PathVariable int id) {
		return service.deleteSupplieruser(id);
	}
}
