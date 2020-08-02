package com.syntax.class07;

public class While {

	public static void main(String[] args) {
		int num = 50;
		while (num >= 1) {
			System.out.print(num + " ");
			num--;
		}
		System.out.println();
		int num1 = 0;
		while (num1 < 20) {
			num1++;
			if(num1 % 2 != 0) {
				System.out.print(num1 + " ");
			}
		}
	}

}
