package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Task3 {

	public static void main(String[] args) {
		
		Set<String> cities = new LinkedHashSet<>();
		cities.add("New York");
		cities.add("Chicago");
		cities.add("Sacramento");
		cities.add("San Francisco");
		cities.add("Antalya");
		cities.add("Washington DC");
		
		System.out.println(cities);
		
		Iterator <String> iter = cities.iterator();
		while (iter.hasNext()) {
			if(iter.next().toLowerCase().startsWith("a")) {
				iter.remove();
		}
		}
		
		System.out.println(cities);
	}

}
