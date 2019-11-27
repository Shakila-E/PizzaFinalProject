package com.pizza.controller;

import java.util.HashMap;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pizza.bean.Customer;
import com.pizza.util.Topping;

@Controller
public class Util {

	@Autowired
	Topping topping;
	
	@RequestMapping(value="/UtilController")
	public String toAdd(Model model)
	{

		 HashMap<Integer,String> hash=new HashMap<Integer,String>();
		 hash=topping.Toppings();
	   model.addAttribute("result",hash);
	   model.addAttribute("customer", new Customer());
	    return "/PlaceOrder";
	}
}
