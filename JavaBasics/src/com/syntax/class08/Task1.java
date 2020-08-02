package com.syntax.class08;

public class Task1 {
	public static void main(String[] args) {
		int sumOdds = 0, sumEven = 0;
		/*for(int i = 1; i < 100; i+=2) {
			sumOdds = sumOdds + i;
	}
		
		for(int i = 0; i < 100; i+=2) {
			sumEven = sumEven + i;
		}
		System.out.println("sum of evens is " + sumEven);
		System.out.println("sum of odds is " + sumOdds);*/
		for(int i = 1; i < 100; i++) {
			if(i % 2 != 0) {
				sumOdds = sumOdds + i;
			}else {
				sumEven = sumEven + i;
			}
		}
		System.out.println("Odds are " + sumOdds);
		System.out.println("Evens are " + sumEven);
	}	
	
	
}
