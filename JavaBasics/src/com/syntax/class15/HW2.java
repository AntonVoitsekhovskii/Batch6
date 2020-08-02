package com.syntax.class15;

public class HW2 {

	public static void main(String[] args) {
		Prime obj = new Prime();
		System.out.println("Your number is prime: " + obj.isPrime(5));
	}

}

	class Prime {
		boolean isPrime(int a) {
			if(a > 0 && a % a == 0) {
				return true;
			}
			else {
				return false;
			}
		}
	}