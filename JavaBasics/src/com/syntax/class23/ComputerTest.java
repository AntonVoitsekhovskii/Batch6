package com.syntax.class23;

public class ComputerTest {

		public static void main(String[] args) {
			
			Computer computers [] = {new Apple("Apple"), new Lenovo("Lenovo"), new HP("HP"), new Dell("Dell")}; 
		
		for(Computer c : computers) {
			c.display();
			c.turnOn();
			c.calculate();
			c.system();
			c.screen();
			System.out.println("------------------------");
		}
		
		HP comp1 = new HP("HP");
		comp1.body();
}
}

