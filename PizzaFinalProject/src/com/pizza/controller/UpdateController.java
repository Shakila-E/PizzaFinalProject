/*package com.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pizza.bean.PizzaOrder;
import com.pizza.service.PizzaOrderService;


@Controller
public class UpdateController {
	@Autowired
	private PizzaOrderService pizzaorderservice;
	
	@RequestMapping(value="/toUpdateOrder")
    public String display1()
    {
		return "/getDetails";
    }
	@RequestMapping(value="/toUpdate",method=RequestMethod.POST)
	public String editEmployee(@RequestParam("id") int id,Model m) throws Exception
	{
	    
		PizzaOrder pizza;
		pizza=pizzaorderservice.getOrderDetails(id);
	   m.addAttribute("updateform",pizza);
		return "/update";
	}
	@RequestMapping(value="/performUpdate",method=RequestMethod.POST)
	public ModelAndView editEmployee(@ModelAttribute("detail2")PizzaOrder pizza) throws Exception
	{
		
	 int res=pizzaorderservice.updateOrderDetails(pizza);
	 if(res!=0)
	 {
		ModelAndView model1=new ModelAndView("/final1");
		return model1;
	 }
	 else
		 return new ModelAndView("/failure");
		
	}
	
}
*/