package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task2 {

	public static void main(String[] args) {
		
		Map <Integer, String> store = new LinkedHashMap<>();
		store.put(7664847, "Printer");
		store.put(7879885, "TV");
		store.put(7549612, "Computer");
		store.put(7775411, "Camera");
		store.put(7135990, "Cell Phone");
		
		Set <Entry<Integer, String>> entries = store.entrySet();
		for(Entry<Integer, String> e : entries) {
			int key = e.getKey();
			String value = e.getValue();
			System.out.println("Key is: " + key + " || Value is " + value);
		}
		
		System.out.println("=================================");
		
		Iterator<Entry<Integer, String>> iter = entries.iterator();
		while (iter.hasNext()) {
			Entry<Integer, String> e = iter.next();
			String s = "Key --> " + e.getKey() + " || Value --> " + e.getValue(); 
			System.out.println(s);
		}
	}

}
