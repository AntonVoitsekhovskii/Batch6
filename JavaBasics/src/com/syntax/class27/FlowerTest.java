package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {
	
		// flowers into array
		Flower[]flowerArray = {new Rose("Rose"), new Tulip("Tulip"), new Sunflower("SunFlower")};
	
		//flowers into ArrayList
		ArrayList <Flower> flowers = new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
		
		flowers.remove(2);
		for(Flower s :flowers) {
			s.display();
		}
		
		System.out.println("=================");
		
		flowers.add(new Sunflower("Sunflower"));
		for(int i = 0; i < flowers.size(); i++) {
			flowers.get(i).display();
		}
		
		System.out.println("=================");
		Iterator<Flower> it = flowers.iterator();
		while (it.hasNext()) {
			Flower f = it.next();
			f.display();
		}
		
		//hw to call available methods using for loop, advanced loop and iterator
		//hw create food class that will have 3 undefine methods and it will have 4 subclasses
		// create co

	}

}
