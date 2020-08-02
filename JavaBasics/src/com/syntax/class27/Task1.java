package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		
		ArrayList <String> cars = new ArrayList<>();
		cars.add("Toyota Supra");
		cars.add("Lexus Is 300");
		cars.add("Buick Futura");
		cars.add("Plymouth Road Runner");
		
		for (String s :cars) {
			System.out.println(s);
		}
		System.out.println("======================");
		
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("======================");
		
		Iterator <String> iter = cars.iterator();
		while (iter.hasNext()) {
			String s = iter.next();
			System.out.println(s);
		}
	}

}
