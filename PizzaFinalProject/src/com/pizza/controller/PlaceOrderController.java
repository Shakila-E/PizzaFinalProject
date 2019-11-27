package com.pizza.controller;



import java.sql.SQLException;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;
import com.pizza.service.PizzaOrderService;
import com.pizza.util.Topping;

@Controller
public class PlaceOrderController {
	
	@Autowired
	private PizzaOrderService pizzaorderservice;
	
	@Autowired
	private PizzaOrder pizza;
	

	@RequestMapping(value="/toPlaceOrder")
	public ModelAndView saveUser(@RequestParam("topping") int topp,Model m,@Valid @ModelAttribute("cusBean")Customer customer,BindingResult result) throws SQLException
	{
		int res=pizzaorderservice.placeOrder(customer,pizza,topp);
		m.addAttribute("pid",res);
		if(result.hasErrors())
		return new ModelAndView("/failure");
		else
			return new ModelAndView("/welcome");
	}
}
