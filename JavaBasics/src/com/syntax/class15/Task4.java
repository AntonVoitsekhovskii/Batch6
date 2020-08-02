package com.syntax.class15;

public class Task4 {

	public static void main(String[] args) {
	Country count = new Country();
	count.sayHello("French");

	}

}
	
	class Country {
		void sayHello(String country) {
			if(country.equalsIgnoreCase("Russia")) {
				System.out.println("Привет");
			}
			else if(country.equalsIgnoreCase("French")) {
				System.out.println("Bonjour");
		}
			else if(country.equalsIgnoreCase("Spain")) {
				System.out.println("Hola");
	}
		}
	}