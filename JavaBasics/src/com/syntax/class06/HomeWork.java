package com.syntax.class06;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double num1, num2, num3 = 0;
		char operator;
		System.out.println("Please enter first number:");
		num1 = scan.nextDouble();
		System.out.println("Please enter second number:");
		num2 = scan.nextDouble();
		System.out.println("Please enter wich operator between your numbers you want to use (+ - * /):");
		operator = scan.next().charAt(0);	
		switch(operator) {
			case '+':
				num3 = num1 + num2;
				break;
			case '-':
				num3 = num1 - num2;
				break;
			case '*':
				num3 = num1 * num2;
				break;
			case '/':
				num3 = num1 / num2;
			default:
				System.out.println("Invalid operator");		
			}
		if(num3 != 0.0) {
			System.out.println("The result is: " + num3);
		}
	}
}
