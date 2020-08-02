package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> llist = new LinkedList<>();
		llist.add("Paul"); //comes from collection
		llist.add(0, "Anton"); // comes from List
		llist.add("Pavel");
		llist.add("Max");
		llist.add("Max");
		
		int size = llist.size();
		//System.out.println(size);
		
		Iterator<String> iter = llist.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
		System.out.println("===================");
		
		for(String s : llist) {
			System.out.println(s);
		}
		System.out.println("===================");
		
		for(int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		
		LinkedList<Food> food= new LinkedList<>();
		food.add(new Salad("salad", "tomato and cucumber", 100));
		food.add(new Dessert("desert", "chocolate", 1000));
		food.add(new MainDish("pasta", "mushrooms", 800));
		
		for(Food f : food) {
			f.calories();
			f.foodType();
			f.ingredient();
			System.out.println("---------------------");
		}

	}

}
