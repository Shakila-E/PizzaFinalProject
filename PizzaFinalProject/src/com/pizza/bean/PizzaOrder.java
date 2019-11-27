package com.pizza.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pizzaorder3")
public class PizzaOrder {
	@Id
	@GeneratedValue
	@Column(name="orderid")
	 int orderId;
	/*
	@Column(name="custid")
	int customerId; */
	
	@Column(name="total")
int totalPrice;
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cid")
	private Customer customerOrder;
	
	public Customer getCustomerOrder() {
		return customerOrder;
	}
	public void setCustomerOrder(Customer customerOrder) {
		this.customerOrder = customerOrder;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int rderId) {
		this.orderId = rderId;
	}
	/*public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}*/
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
