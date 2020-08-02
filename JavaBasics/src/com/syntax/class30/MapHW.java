package com.syntax.class30;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapHW {

	public static void main(String[] args) {
		
		Map<Integer, String> building=new LinkedHashMap<>();
		building.put(1, "Google");
		building.put(2, "Syntax");
		building.put(3, "Google");
		building.put(4, "Amazon");
		building.put(4, "Amazon");
		building.put(5, "HP");
		building.put(6, "Microsoft");
		building.put(7, "Oracle");

		System.out.println(building.size());
		System.out.println(building);
		
		//get all keys
		Set<Integer> keys = building.keySet();
		System.out.println();
		System.out.println("---getting keys using iterator-----");
		Iterator<Integer> keysIt = keys.iterator();
		while(keysIt.hasNext()) {
			int key = keysIt.next();
			System.out.println("Key is " + key + " and value is " + building.get(key));
		}
		System.out.println();
		System.out.println("---getting keys using for each loop-----");
		for(Integer s : keys) {
			System.out.println("Key --> " + s + " and value --> " + building.get(s));
		}
		
		//how to get all valueus
		Collection<String> values = building.values();
		System.out.println();
		System.out.println("---getting all values using for each loop-----");
		for(String s : values) {
			System.out.println("Value is " + s);
		}
		System.out.println();
		System.out.println("---getting all values using iterator-----");
		Iterator<String> iter = values.iterator();
		while (iter.hasNext()) {
			System.out.println("Value --> " + iter.next());
		}
		
	}

}
