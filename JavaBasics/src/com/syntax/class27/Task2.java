package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {

	public static void main(String[] args) {
		
		ArrayList<String> words = new ArrayList<>();
		words.add("case");
		words.add("string");
		words.add("code");
		words.add("java");
	
	
		Iterator<String> iter = words.iterator();
		while (iter.hasNext()) {
			if(iter.next().endsWith("e")) {
				iter.remove();
			}
		}
		
		System.out.println(words);
		
	}

}
