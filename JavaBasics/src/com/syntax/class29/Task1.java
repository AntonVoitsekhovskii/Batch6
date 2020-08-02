package com.syntax.class29;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
		
		Set<String> countries = new TreeSet<>();
		countries.add("Russia");
		countries.add("Turkish");
		countries.add("USA");
		countries.add("Ukraine");
		countries.add("Belorusia");
		countries.add("Britain");
		
		System.out.println(countries);
		
		Iterator<String> iter = countries.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		System.out.println("========================");
		
		for (String s : countries) {
			System.out.println(s);
		}

	}

}
