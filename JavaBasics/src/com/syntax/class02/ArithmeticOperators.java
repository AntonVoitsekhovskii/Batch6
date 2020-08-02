package com.syntax.class02;

public class ArithmeticOperators {

	public static void main(String[] args) {

		int num1 = 15, num2 = 32;
		//int num2 = 32;

		System.out.println("The add of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 + num2));
		System.out.println("The subtract of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 - num2));
		System.out.println("The multiply of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 * num2));
		System.out.println("The divide of 2 numbers " + num1 + " and " + num2 + " is equal to " + (num1 / num2));

		System.out.println();

		double num3 = 3.9;
		double squ = num3 * num3;
		int i = num2 - num1;

		System.out.println("The square of the " + num3 + " is " + squ);

		int width = 5;
		int height = 8;
		int perimeter = (width * 2) + (height * 2);
		int area = width * height;
		System.out.println("The perimeter of a rectangle with width " + width + " and height " + height
				+ " is equal to " + perimeter + " and the area is " + area);
		
		
	}
}
