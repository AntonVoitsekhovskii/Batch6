package com.syntax.class04;

public class task2 {
	public static void main(String[] args) {
	double rate = 3;
	int price = 150000;
	if(rate > 4.5) {
		System.out.println("I will not buy house");
	}
	else {
		System.out.println("I will buy a house");
		if(price > 200000) {
			System.out.println("I will take a loan");
		}
		else {
			System.out.println("I will pay cash");
		}
	}
}
}
