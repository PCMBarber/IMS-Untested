package com.qa.ims.persistence.domain;

import java.util.List;

public class Order {

	private Long id;
	private Customer customer;
	private List<Item> items;

	public Order(Long id, Customer customer, List<Item> items) {
		super();
		this.id = id;
		this.customer = customer;
		this.items = items;
	}

	public Order(Customer customer) {
		super();
		this.id = 0L;
		this.customer = customer;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItem(List<Item> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		String lines = "\n";
		double totalPrice = 0.0;
		for (Item item : items) {
			totalPrice += item.getPrice();
			lines += item.toString() + " \n";
		}
		return "Order [id=" + id + ", customer=" + customer.toString() + ", Items: " + lines + " Total Price: £" + totalPrice + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (customer == null) {
			if (other.customer != null)
				return false;
		} else if (!customer.equals(other.customer))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (items == null) {
			if (other.items != null)
				return false;
		} else if (!items.equals(other.items))
			return false;
		return true;
	}

}
