package com.syntax.class29;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class OtherMap {

	public static void main(String[] args) {
		
		Map <Integer, String> lmap = new LinkedHashMap<>();
		lmap.put(1000, "John Smith");
		lmap.put(1001, "Jane Smith");
		lmap.put(1002, "Faisal Sakhi");
		lmap.put(102, "Ali Tarlaci");
		
		System.out.println(lmap);
		
		Map <Integer, String> tmap = new TreeMap<>();
		tmap.put(1000, "John Smith");
		tmap.put(1001, "Jane Smith");
		tmap.put(1002, "Faisal Sakhi");
		tmap.put(102, "Ali Tarlaci");
		
		System.out.println(tmap);

		
		Map<String, Integer> tmap2 = new TreeMap<>();
		tmap2.put("Russia", 2000000);
		tmap2.put("USA", 3000000);
		tmap2.put("Belorusia", 1000000);
		tmap2.put("Ukraine", 1500000);
		
		System.out.println(tmap2);
		
		System.out.println("==============================");
		
		Set <String> keys = tmap2.keySet();
		for(String s : keys) {
			System.out.println(s);
		}
		System.out.println("-------------------------------");
		
		Collection<Integer> values = tmap2.values();
		for(int i : values) {
			System.out.println(i);
		}
		
		System.out.println("-------------------------------");
		
		Set<Map.Entry<String, Integer>> entry = tmap2.entrySet();
	}

}
