package com.pizza.dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;
import com.pizza.exception.OrderNotFoundException;
import com.pizza.exception.PizzaException;

public class PizzaOrderDAO implements IPizzaOrderDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private PizzaOrder pizzaorder;
	
	   
	
	@Override
	public int placeOrder(Customer customer, PizzaOrder pizza) {
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		pizzaorder.setCustomerOrder(customer);
		session.save(pizza);
		tx.commit();
		return pizza.getOrderId();
	}
	@Override
	public PizzaOrder getOrderDetails(int orderid) throws PizzaException {
		String HQL_QUERY="Select ";
		//Query query=session.createQuery(HQL_QUERY);
		return pizzaorder;
		
	}
	@Override
	public Customer getCustomerDetails(int orderId) {
		
		return null;
	}
	@Override
	public int updateOrder(Customer customer) throws OrderNotFoundException {
		
		return 0;
	}
	@Override
	public int deleteOrder(Customer customer) throws OrderNotFoundException {
		
		return 0;
	}
}
	
	