package com.javaminions.services;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConfirmOrderService {
	
	public static String confirmOrder(int id, int quantity) {
		RestTemplate rt = new RestTemplate();
		String url = "http://localhost:8088/updateQuantity/"+id+"/"+quantity;
		
		ResponseEntity<String> response = rt.getForEntity(url, String.class);
		String confirmation = response.getBody();
		return confirmation;
	}

}
