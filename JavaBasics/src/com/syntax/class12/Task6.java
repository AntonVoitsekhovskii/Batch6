package com.syntax.class12;

public class Task6 {
	
	public static void main(String[] args) {
		
		String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String [] arr = a.split("\\?");
		int j = 0;
		for(String i:arr) {
			j++;
		}
		System.out.println(j);
	}
}
