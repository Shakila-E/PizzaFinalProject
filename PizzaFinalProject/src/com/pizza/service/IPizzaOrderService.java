package com.pizza.service;

import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;
import com.pizza.exception.OrderNotFoundException;
import com.pizza.exception.PizzaException;

public interface IPizzaOrderService {
	public int placeOrder(Customer customer,PizzaOrder pizza,int pTopping);
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException;
	public Customer getCustomerDetails(int orderId);
	public int updateOrder(Customer customer) throws OrderNotFoundException;
	public int deleteOrder(Customer customer) throws OrderNotFoundException;
	}


