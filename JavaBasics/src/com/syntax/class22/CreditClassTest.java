package com.syntax.class22;

public class CreditClassTest {

	public static void main(String[] args) {
		
		CreditCard card1 = new CreditCard(1000);
		double a = card1.calcInterest();
		System.out.println(a);
		
		Visa card2 = new Visa(1000);
		a = card2.calcInterest();
		System.out.println(a);
		
		AX card3 = new AX(1000);
		a = card3.calcInterest();
		System.out.println(a);

	}

}
