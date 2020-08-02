package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
		Map <String, Integer> grocery = new HashMap<>();
		grocery.put("milk", 1);
		grocery.put("cucmber", 3);
		grocery.put("banana", 12);
		grocery.put("cheese", 2);
		grocery.put("grapes", 3);
		System.out.println(grocery);
		
		//create a map of iteams to buy (iteam, quantity)
		Map <String, Integer> household = new LinkedHashMap<>();
		household.put("lysol", 2);
		household.put("sanitaizer", 2);
		household.put("paper towel", 3);
		household.put("toilet paper", 10);
		household.put("face mask", 50);
		System.out.println(household);
		
		//create one map
		Map <String, Integer> shopping = new TreeMap<>(grocery);
		shopping.putAll(household);
		System.out.println(shopping);
		
		//get all keys
		for(String s : shopping.keySet()) {
			System.out.println("Key: " + s);
		}
	
		System.out.println("---------------------------------");
		
		//get all keys using iterator
		Iterator<String> iter = shopping.keySet().iterator();
		while (iter.hasNext()) {
			System.out.println("Key --> " + iter.next());
		}
		
		System.out.println("---------------------------------");
		
		//get all values
		for(int i : shopping.values()) {
			System.out.println("Value: " + i);
		}
		
		System.out.println("---------------------------------");
		//get all values using iterator
		Iterator<Integer> it = shopping.values().iterator();
		while(it.hasNext()) {
			System.out.println("Value --> " + it.next());
		}
	}

}
