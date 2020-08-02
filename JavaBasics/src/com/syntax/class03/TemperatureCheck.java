package com.syntax.class03;

public class TemperatureCheck {
	public static void main(String[] args) {
		int myTemp = 31;
		
		if(myTemp < 32) {
			System.out.println("Water will freeze with temperature " + myTemp);
		}
		else {
			System.out.println("Water will NOT freeze with temperature " + myTemp);
		}
	}
}
