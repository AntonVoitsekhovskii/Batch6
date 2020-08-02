package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FoodTest {

	public static void main(String[] args) {
		
		ArrayList<Food> feed = new ArrayList<>();
		feed.add(new Meat("Beef"));
		feed.add(new Meat("Pork"));
		feed.add(new Fruits("Orange"));
		feed.add(new Fruits("Apple"));
		feed.add(new Vegetables("Tomato"));
		feed.add(new Vegetables("Cucumber"));
		
		for(Food f : feed) {
			f.display();
		}
		System.out.println("==================");
		
		for(int i = 0; i < feed.size(); i++) {
			feed.get(i).display();
		}
		System.out.println("==================");
		
		Iterator<Food> iter = feed.iterator();
		while (iter.hasNext()) {
			Food f = iter.next();
			f.display();
		}

	}

}
