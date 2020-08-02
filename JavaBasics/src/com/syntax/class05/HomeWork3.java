package com.syntax.class05;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1, num2, num3, s;
		System.out.println("Enter first number:");
		num1 = scan.nextDouble();
		System.out.println("Enter second number:");
		num2 = scan.nextDouble();
		System.out.println("Enter third number:");
		num3 = scan.nextDouble();
			if(num1 > num2 && num1 > num3) {
				s = num1;
			}
			else if(num2 > num1 && num2 > num3) {
				s = num2;
			}
			else {
				s = num3;
			}
			System.out.println("The biggest number is " + s);
			scan.close();
	}

}
