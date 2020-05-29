package com.javaminions.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaminions.pojos.Supplieruser;
import com.javaminions.repos.SupplieruserRepo;


@Service
public class SupplieruserService {
	@Autowired
	private SupplieruserRepo repository;
	
	
	public Supplieruser saveSupplieruser(Supplieruser supplieruser) {
		return repository.save(supplieruser);
	}
	
	public String deleteSupplieruser(int id) {
		repository.deleteById(id);
		return "user name" +id + "removed!!";
		
	}
	
	public Supplieruser updateSupplieruser(Supplieruser supplieruser) {
		Supplieruser existingUser=repository.findById(supplieruser.getId()).orElse(null);
		existingUser.setUsername(supplieruser.getUsername());
		existingUser.setPassword(supplieruser.getPassword());
		return repository.save(existingUser);

	}
	
	
}
