package com.syntax.class23;

public class CarTest {

	public static void main(String[] args) {
		
		Car bmw = new BMW("BMW");
		bmw.display();
		bmw.start();
		//bmw.navigatte(); CE undefined method in Car
		Car tesla = new Tesla("Tesla");
		Car merc = new Mercedes("Mercedes");
		Car honda = new Honda("Honda");

		Car[] cars = {new BMW("BMW"), new Tesla("Tesla"), new Mercedes("Mercedes"), new Honda("Honda")};
		
		for(Car c:cars) {
			c.display();
			c.start();
			System.out.println("------------------------");
		}
		
		System.out.println("==============================");
		
		for(int i = 0; i < cars.length; i++) {
			cars[i].display();
			cars[i].start();
			System.out.println("-----------------------");
		}
	}
	}

