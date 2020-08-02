package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {

	public static void main(String[] args) {
		
		Map<String , Integer> month = new LinkedHashMap<>();
		month.put("January", 31);
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 30);
		
		System.out.println(month.size());
		
		Set<Entry<String, Integer>> entries = month.entrySet();
		
		//loop through all entry objects
		for(Entry <String, Integer> e : entries) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
		
		System.out.println("----------------------------------");
		//iterate through all entry objects
		Iterator <Entry<String, Integer>> it = entries.iterator();
		while(it.hasNext()) {
			//System.out.println("Key --> " + it.next().getKey() + "  Value --> " + it.next().getValue()); --> will not work
			Entry <String, Integer> e = it.next();
			System.out.println("Key --> " + e.getKey() + " || Value --> " + e.getValue());
		}
	}

}
