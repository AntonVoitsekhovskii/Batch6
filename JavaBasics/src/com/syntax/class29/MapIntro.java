package com.syntax.class29;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {
		
		HashMap<String, String> hmap = new HashMap<>();
		
		hmap.put("Name", "John");
		hmap.put("Last Name", "Smith");
		hmap.put("Address", "123 Test");
		hmap.put("City", "Chantilly");
		
		boolean isEmpty = hmap.isEmpty();
		System.out.println("Map is empty = " + isEmpty);
		
		int i = hmap.size();
		System.out.println("Map size is = " + i);
		
		hmap.put("Zip", "12345");
		hmap.put("Name", "Jane");
		System.out.println(hmap);
		
		System.out.println(hmap.get("Name"));
		
		hmap.remove("Address");
		System.out.println(hmap);
		
		hmap.replace("Zip", "98765");
		System.out.println(hmap);
	}

}
