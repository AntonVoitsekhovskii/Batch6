package com.syntax.class15;

public class Task2 {

	public static void main(String[] args) {
	OtherNumber num = new OtherNumber();
	num.evenOdd(0);
	
	}

}

	class OtherNumber {
		void evenOdd(int a) {
			
			if(a % 2 == 0) { 
				System.out.println("Number " + a + " is even");
			}
			else {
				System.out.println("Number " + a + " is odd");
			}
		}
	}