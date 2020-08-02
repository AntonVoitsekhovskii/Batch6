package com.syntax.class15;

public class Task1 {

	public static void main(String[] args) {
		Number num = new Number();
		num.max(5, 5);
		int k = num.biggest(12, 7);
		boolean g = num.evenOdd(k);
		System.out.println("Largest number " + k + " is odd: " + g);
		
	}

}

class Number {
	void max(int a, int b) {
		if(a > b) {
			System.out.println(a + " is bigger than " + b);
		}
		else if(a < b) {
			System.out.println(b + " is bigger than " + a);
		}
		else {
			System.out.println(a + " and " + b + " are equal");
		}
	}

 	int biggest(int i, int j) {
	 if(i > j) {
		 return i;
	 }
	 else {
		 return j;
	 }
 }
 

	boolean evenOdd(int a) {
		boolean isOdd;
		if(a % 2 != 0) { 
			isOdd = true;
		}
		else {
			isOdd = false;
		}
		return isOdd;
	}
}