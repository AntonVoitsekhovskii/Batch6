package com.syntax.class26;

import java.util.ArrayList;

public class HW {
	
	public static void main(String[] args) {
		
	ArrayList<String> names = new ArrayList<>();
	names.add("Anton");
	names.add("Paul");
	names.add("Max");
	names.add("Andrew");
	names.add("Stanley");
	
	if(names.isEmpty()) {
		System.out.println("Your names list is empty");
	}
	else {
		System.out.println("Your names list has names");
	}
	
	System.out.println("===============================");
	
	if(names.contains("Anton")) {
		System.out.println("You have that name in your list");
	}
	else {
		System.out.println("You do not have that name in your list");
	}
	
	System.out.println("=================================");
	
	for(int i = 0; i < names.size(); i ++) {
		String elem = names.get(i);
		System.out.print(elem + "  ");
	}
	System.out.println();
	System.out.println("===============================");
	
	for(String s :names) {
		System.out.println(s);
	}
	}

	
}
