package com.pizza.dao;

import java.sql.SQLException;

import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;
import com.pizza.exception.OrderNotFoundException;
import com.pizza.exception.PizzaException;

public interface IPizzaOrderDAO {
	public int placeOrder(Customer customer,PizzaOrder pizza);
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException; 
	public Customer getCustomerDetails(int orderId);
	public int updateOrder(Customer customer) throws OrderNotFoundException;
	public int deleteOrder(Customer customer) throws OrderNotFoundException;

}
