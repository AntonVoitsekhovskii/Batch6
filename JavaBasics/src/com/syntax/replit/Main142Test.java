package com.syntax.replit;

public class Main142Test {
	public static void main(String[] args) {
		
		Main142 obj1 = new Main142("Blanket", 49.99, 2);
		obj1.print();
		
		Main142 obj2 = new Main142("Mattress", 219.59, 2);
		obj2.print();
		
		double sum1 = obj1.iteamTotalPrice();
		double sum2 = obj2.iteamTotalPrice();
		
		System.out.println("You purchased " + (sum1 + sum2) + " Today");
		
	}
}
