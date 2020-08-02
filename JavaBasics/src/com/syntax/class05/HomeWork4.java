package com.syntax.class05;

import java.util.Scanner;

public class HomeWork4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1, num2, num3, s;
		System.out.println("Enter first number:");
		num1 = scan.nextDouble();
		System.out.println("Enter second number:");
		num2 = scan.nextDouble();
		System.out.println("Enter third number:");
		num3 = scan.nextDouble();
		s = 0;
		if (num1 > num2) {
			if (num1 > num3) {
				s = num1;
			} else {
				s = num3;
			}
		} else if (num2 > num1) {
			if (num2 > num3) {
				s = num2;
			} else {
				s = num3;
			}
		} else {

		}

		System.out.println("The biggest number is " + s);
		scan.close();
	}

}
