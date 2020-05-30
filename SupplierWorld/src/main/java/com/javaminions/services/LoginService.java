package com.javaminions.services;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.javaminions.pojos.Supplieruser;
import com.javaminions.repos.SupplieruserRepo;


public class LoginService {
	
	boolean signedin;
	
	public boolean loginUser (HttpServletRequest request, HttpServletResponse response, String username, String password, SupplieruserRepo users) {
		
		String message = "";
		HttpSession session = request.getSession();
		List<Supplieruser> theUsers = (List<Supplieruser>) users.findAll();
		Supplieruser user = new Supplieruser();
		user.setUsername("notfound");
		
		
		for(Supplieruser u: theUsers) {
			if(u.getUsername().equalsIgnoreCase(username) && u.getPassword().equals(password)) {
				System.out.println();
				user = u;
			}
		}
		
		if (user.getUsername().equals("notfound")) {
			message = "This username or password was incorrect. Please try again";
			signedin = false;
		}
		else if (!user.getUsername().equals("notfound")) {
			session.setAttribute("user", user);
			signedin = true;
		}
		

		return signedin;
	}

}
