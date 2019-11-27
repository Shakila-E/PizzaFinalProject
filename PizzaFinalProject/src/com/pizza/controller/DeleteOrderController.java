package com.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pizza.bean.Customer;
import com.pizza.bean.PizzaOrder;
import com.pizza.service.PizzaOrderService;


@Controller
public class DeleteOrderController {
	@Autowired
	private PizzaOrderService pizzaorderservice;
	
	@Autowired
	private PizzaOrder pizza;
	
	@RequestMapping("/toDeleteOrder")
    public String display2()
    {
		return "/getValues";
    }
	@RequestMapping(value="/doDelete",method=RequestMethod.POST)
	public String removeEmployee(@RequestParam("id") int id,Model m) throws Exception
	{
	    
		
		  //pizza=pizzaorderservice.deleteOrder(id);
		  m.addAttribute("pizza1",pizza);
		return "/display1";
	}
	@RequestMapping(value="/remove",method=RequestMethod.POST)
	public ModelAndView removeEmployee(@ModelAttribute("detail2")Customer customer)
	{
		
	// pizzaorderservice.deleteOrderDetails(customer);
		ModelAndView model1=new ModelAndView("/final2");
		return model1;
	}
}
