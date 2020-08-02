package com.syntax.class19;

public class Task1 {
	
	String name, address;
	
	Task1(String name, String address) {
		
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println("Student " + name + " address is " + address);
	}
	
	public static void main(String[] args) {
		Task1 obj = new Task1("Anton", "290 Quentin Rd");
		obj.displayInfo();
	}
}
