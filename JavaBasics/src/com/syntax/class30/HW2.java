package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class HW2 {

	public static void main(String[] args) {
		
		Map<String, Integer> cities = new LinkedHashMap<>();
		cities.put("Paris", 5);
		cities.put("Moscow", 6);
		cities.put("San Francisco", 13);
		cities.put("New York", 8);
		cities.put("Boston", 6);
		
		System.out.println(cities);
		
		Collection<String> key = cities.keySet();
		for(String s : key) {
			if (s.length() > 7) {
				cities.remove(s);
			}
		}
		
		System.out.println(cities);

	}

}
