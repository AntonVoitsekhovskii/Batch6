package com.syntax.class08;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, sumOdds = 0, sumEvens = 0;
		System.out.println("Please print ten any numbers");
			for(int i = 1; i < 11; i++) {
				num = scan.nextInt();
				if(num % 2 == 0) {
					sumEvens += num;  
				}
				else {
					sumOdds += num;
				}
			}
		System.out.println("Sum of even numbers that you enter are: " + sumEvens);
		System.out.println("Sum of odd numbers that you enter are: " + sumOdds);
		
		
		
		
		
		
	}
}
