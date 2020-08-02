package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {

	public static void main(String[] args) {
		
		Map <String, String> countries = new TreeMap<>();
		countries.put("Russia", "Moscow");
		countries.put("Ukraine", "Kiev");
		countries.put("Belorusia", "Minsk");
		countries.put("USA", "Washington DC");
		countries.put("France", "Paris");
		countries.put("Australia", "Canberra");
		countries.put("Canada", "Ottawa");
		
		for(String s : countries.keySet()) {
			System.out.println("Key is " + s + " and Value is " + countries.get(s));
		}
		System.out.println("------------------------");
		
		Iterator<String> iter = countries.keySet().iterator();
		while(iter.hasNext()) {
			String s = iter.next();
			System.out.println("Key --> " + s + " Value --> " + countries.get(s));
		}
		
		System.out.println("------------------------");
		
		for(String s : countries.values()) {
			System.out.println("Value is " + s);
		}
		
		System.out.println("------------------------");
		Iterator<String> it = countries.values().iterator();
		while(it.hasNext()) {
			System.out.println("Value --> " + it.next());
		}
		
		System.out.println("------------------------");
		System.out.println(countries);
		Set<Entry<String, String>> allEntries = countries.entrySet();
		System.out.println(allEntries);
		
		System.out.println("------------------------");
		for(Entry<String, String> e : allEntries) {
			String key = e.getKey();
			String value = e.getValue();
			System.out.println(key + " --- " + value);
		}
		
		System.out.println("------------------------");
		Iterator<Entry<String, String>> iter2 = allEntries.iterator();
		while(iter2.hasNext()) {
			Entry<String, String> s = iter2.next();
			String str = s.getKey() + "   " + s.getValue();
			System.out.println(str);
		}
	}

}
