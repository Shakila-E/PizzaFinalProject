package com.pizza.util;

import java.util.HashMap;

public class Topping {
	public static HashMap<Integer,String> Toppings()
	{
  HashMap<Integer,String> hm=new HashMap<Integer,String>();
  hm.put(30,"Capsicum");
  hm.put(50,"Mushroom");
  hm.put(70,"Jalapeno");
  hm.put(85, "Paneer");
  return hm;
	}
}
