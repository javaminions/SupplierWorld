package com.javaminions.pojos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Supplierstock {

	@Id
	public int id;
	public int quantity;

	public int getId() {
		return id;
	}

	public void setId(int product_code) {
		this.id = product_code;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Supplierstock(int product_code, int quantity) {
		super();
		this.id = product_code;
		this.quantity = quantity;
	}

	public Supplierstock() {
		super();
	}

	@Override
	public String toString() {
		return "Supplierstock [product_code=" + id + ", quantity=" + quantity + "]";
	}

}
