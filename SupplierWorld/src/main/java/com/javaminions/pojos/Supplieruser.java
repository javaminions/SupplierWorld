package com.javaminions.pojos;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class Supplieruser {
	
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		public Supplieruser() {
			super();
		}
		
		public Supplieruser(int id, String username, String password) {
			super();
			this.id = id;
			this.username = username;
			this.password = password;
		}
		@Override
		public String toString() {
			return "Supplieruser [id=" + id + ", username=" + username + ", password=" + password + "]";
		}
		private String username;
		private String password;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		
		

}