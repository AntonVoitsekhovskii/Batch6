package com.syntax.class29;

import java.util.*;
import java.util.Set;

public class SetFamily {

	public static void main(String[] args) {
		
		Set<String> veggies = new HashSet<>();
		veggies.add("carrot");
		veggies.add("potato");
		veggies.add("cucumber");
		veggies.add("eggplant");
		veggies.add("potato");
		veggies.add("cucumber");
		
		System.out.println(veggies);

		System.out.println("-----------------------------------");
		
		//LinkedHashSet guarantee insertion order
		Set<String> fruits = new LinkedHashSet<>();
		fruits.add("apple");
		fruits.add("mango");
		fruits.add("kiwi");
		fruits.add("tomato");
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("tomato");
		
		System.out.println(fruits);
		
		System.out.println("-----------------------------------");
		
		//tree set stores objects in ascending order
		Set<String> food = new TreeSet<>(veggies);
		food.addAll(veggies);
		food.addAll(fruits);
		System.out.println(food);
		
		
		
	}

}
