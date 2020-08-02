package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> breakfast = new HashSet<>();
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("coffee");
		breakfast.add("cream cheese");
		breakfast.add("eggs");
		breakfast.add("tea");
		
		
		//how many elements in the set
		
		int size = breakfast.size();
		System.out.println(size);
		//order is not maintained
		System.out.println(breakfast);
		
		//we need to retrieve an element --> no get method available
		
		//we can retrieve all elements
		Iterator <String> myIterator = breakfast.iterator();
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		System.out.println("-----------------------");
		for(String s : breakfast) {
			System.out.println(s);
		}
		
	}

}
