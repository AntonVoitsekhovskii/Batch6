package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class HW1Test {

	public static void main(String[] args) {
		
		Map<Integer, Person> person = new LinkedHashMap<>();
		person.put(01, new Person("Anton", "Voitsekhovskii", 31, 90000));
		person.put(02, new Person("Paul", "Trapezau", 30, 85000));
		person.put(03, new Person("Onur", "Eker", 31, 90000));
		person.put(04, new Person("Max", "Gorpinich", 31, 90000));
		
		Collection <Person> col = person.values();
		
		for(Person p : col) {
			p.display();
		}
	}

}
