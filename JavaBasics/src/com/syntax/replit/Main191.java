package com.syntax.replit;

import java.util.*;
import java.util.Map.Entry;



public class Main191 {
	
		public static void main(String[] args) {
		   
		List <Map<String,Object>> dataList = new ArrayList<Map<String,Object>>(); 
				
		Map<String, Object> appleMap = new HashMap<String, Object>(); 
		appleMap.put("Items", "Apple"); 
		appleMap.put("Price", 20.00);
		appleMap.put("Quantity", 10);
		dataList.add(appleMap);
				
		Map<String, Object> orangeMap = new HashMap<String, Object>(); 
		orangeMap.put("Items", "Orange"); 
		orangeMap.put("Price", 21.99);
		orangeMap.put("Quantity", 10);
		dataList.add(orangeMap);
			
		double TotalPrice = 0; 
				
		for (Map<String, Object> map : dataList) {
			String items = map.get("Items").toString();
			double price = Double.parseDouble(map.get("Price").toString());
			double quant = Double.parseDouble(map.get("Quantity").toString());
			double lineTotal = price * quant; 
					
			System.out.println("Items: " + items + " Price: " + price + " Quantity: " + quant + " SubTotal: " + lineTotal);
			TotalPrice += lineTotal; 
		}
			System.out.println("Your Purchase total : " + TotalPrice);
			  
    }			            	       
}
