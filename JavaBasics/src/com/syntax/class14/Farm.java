package com.syntax.class14;

public class Farm {

	public static void main(String[] args) {
		
        Dog dog1 = new Dog();

		dog1.bread = "Doberman";
		dog1.color = "Black";
		dog1.name = "Harley";
		dog1.age = 5;
		
		Dog dog2 = new Dog();
		dog2.bread = "Dalmation";
		dog2.color = "Black and White";
		dog2.name = "Rascal";
		dog2.age = 2;
		
		dog2.bark();
		dog1.run();
		dog1.eat();

	}
}
	
	 	class Dog {
		
	 	String bread;
		String color;
		String name;
		int age;
		
		void bark() {
			System.out.println(name + " is barkling");
		}
		
		void eat() {
			System.out.println(name + " can eat");
		}
		void run() {
			System.out.println(name + " can run");
		}
	 	}

