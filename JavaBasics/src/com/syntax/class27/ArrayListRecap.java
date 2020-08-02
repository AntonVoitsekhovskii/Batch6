package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListRecap {

	public static void main(String[] args) {
		
		ArrayList<Double> alist = new ArrayList<>();
		alist.add(10.99);
		alist.add(12.99);
		alist.add(100.99);
		
		System.out.println(alist);
		//replace element
		alist.set(1, 13.90);
		System.out.println(alist);
		
		//remove element
		alist.remove(13.90);
		System.out.println(alist);
		
		System.out.println("========================= 1");
		
		//1. use advanced for loop
		for(double a : alist) {
			System.out.println(a);
		}
		
		System.out.println("========================= 2");
		//2. for loop
		for(int i = 0; i <alist.size(); i ++) {
			double d = alist.get(i);
			System.out.println(d);
		}
		
		System.out.println("========================= 3");
		//3. Iterator
		Iterator<Double> iter = alist.iterator();
		while (iter.hasNext()) {
			double d = iter.next();
			System.out.println(d);
		}
		System.out.println("============================");
		
		ArrayList obj = new ArrayList<>();
		obj.add("hello");
		obj.add(129);
		obj.add('c');
		obj.add(alist);
		for(Object o : obj) {
			System.out.println(o);
		}
	}
}
