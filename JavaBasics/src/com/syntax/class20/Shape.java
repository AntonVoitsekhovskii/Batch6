package com.syntax.class20;

public class Shape {
	
	static double pi = 3.14;
	int radius;
	
	Shape(int radius) {
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Circule obj = new Circule(9);
		System.out.println(obj.calculate());
	}
}	
	
	class Circule extends Shape {
		
		Circule(int radius) {
			super(radius);
		}
		
		double calculate() {
			double sq = pi * (radius * radius);
			return sq;
		}
		
	}

