package com.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pizza.bean.PizzaOrder;
import com.pizza.service.PizzaOrderService;


@Controller
public class DisplayOrderController {
	@Autowired
	private PizzaOrderService pizzaorderservice;
	
	@Autowired
	PizzaOrder pizza;
	@RequestMapping(value="/toDisplayOrder")
    public String display1()
    {
		return "/getDetails";
    }
	@RequestMapping(value="/doDisplayOrder")
	public String editEmployee(@RequestParam("id") int id,Model m) throws Exception
	{
	  pizza=pizzaorderservice.getOrderDetails(id);
	   m.addAttribute("pizza1",pizza);
		return "/display";
	}
}
