package com.pizza.service;



import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;
import com.pizza.dao.IPizzaOrderDAO;
import com.pizza.dao.PizzaOrderDAO;
import com.pizza.exception.OrderNotFoundException;
import com.pizza.exception.PizzaException;


public class PizzaOrderService implements IPizzaOrderService{
	
	@Autowired
	private PizzaOrderDAO pizzaorderdao;
    
	@Autowired
	private PizzaOrder pizza;
	@Override
	public int placeOrder(Customer customer, PizzaOrder pizza, int pTopping) {
		int total=0;
		total=350+pTopping;
		pizza.setTotalPrice(total);
		int res=pizzaorderdao.placeOrder(customer, pizza);
		return res;
	}

	@Override
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException {
		pizza=pizzaorderdao.getOrderDetails(orderid);
		return pizza;
	}

	@Override
	public Customer getCustomerDetails(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateOrder(Customer customer) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteOrder(Customer customer) throws OrderNotFoundException {
		// TODO Auto-generated method stub
		return 0;
	}
}