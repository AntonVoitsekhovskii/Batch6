package com.syntax.class18;

public class Task3 {
	
	public Task3(String i) {
		System.out.println("Public constructor");
	}
	
	Task3(int a) {
		System.out.println("Default constructor");
	}
	
	protected Task3(int a, int b) {
		System.out.println("Protected constructor");
	}
	
	private Task3(String i, int a) {
		System.out.println("Private constructor");
	}
	
	
	public static void main(String[] args) {
		
		Task3 obj1 = new Task3("Hello");
		Task3 obj2 = new Task3(5);
		Task3 obj3 = new Task3(7, 12);
		Task3 obj4 = new Task3("Java", 3);
	}
}
