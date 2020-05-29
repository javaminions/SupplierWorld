package com.javaminions.pojos;

import java.util.ArrayList;
import java.util.List;

public class SupplierordersList {
	
	private List<Supplierorders> orders = new ArrayList<Supplierorders>();

	public List<Supplierorders> getOrders() {
		return orders;
	}

	public void setOrders(List<Supplierorders> orders) {
		this.orders = orders;
	}

	public SupplierordersList(List<Supplierorders> orders) {
		super();
		this.orders = orders;
	}

	public SupplierordersList() {
		super();
	}
	
	public void addOrder(Supplierorders order) {
		orders.add(order);
	}

}
