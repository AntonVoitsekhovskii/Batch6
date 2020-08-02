package com.syntax.class23;

public class Computer {

	String make;
	
	Computer(String make) {
		this.make = make;
	}
		public void display() {
			System.out.println("I have " + make + " computer");
		}
	
		public void turnOn() {
			System.out.println(make + " can turn on");
		}
		
		public void calculate() {
			System.out.println(make + " can calculate");
		}
		
		public void system() {
			System.out.println(make + " has Windows OS");
		}
		public void screen() {
			System.out.println(make + " does not have touch screen");
		}
}

class Apple extends Computer {
	Apple(String make) {
		super(make);
	}
	
	@Override
	public void system() {
		System.out.println(make + " has Mac OS");
	}
}

class Lenovo extends Computer {
	Lenovo(String make) {
		super(make);
	}
	@Override
		public void screen() {
			System.out.println(make + " have a touch screen");
		}
}

class HP extends Computer {
	HP(String make) {
		super(make);
}
	public void body() {
		System.out.println(make + " have a thin body");
	}
}
class Dell extends Computer {
	Dell(String make) {
		super(make);
}
}