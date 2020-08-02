package com.syntax.class22;

public class CreditCard {
	
	double balance;
	double interest;
	
	public CreditCard(double balance) {
		this.balance = balance;
	}
	
	double calcInterest() {
		if(balance < 1000) {
			interest = balance * 0.05;
		}
		else {
			interest = 0;
		}
		return interest;
	}
}

class Visa extends CreditCard {
	public Visa(double balance) {
		super(balance);
	}
}

class AX extends CreditCard {
	public AX(double balance) {
		super(balance);
	}
	double calcInterest() {
				if(balance < 1000) {
					interest = balance * 0.02;
				}
				else {
					interest = balance * 0.01;
				}
				return interest;
			}
	}

