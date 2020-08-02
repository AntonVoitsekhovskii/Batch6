package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store {	
	String type, name;
	
	public Store(String type, String name) {
		this.type = type;
		this.name = name;
	}
	
	public void display() {
		System.out.println("This is store " + name);
	}
	
	public abstract void workingHours();
}


class Nike extends Store {	
	public Nike(String type, String name) {
		super(type, name);
	}
	
	public void workingHours() {
		System.out.println(name + " works from 10am till 6pm");
	}
}


class Costco extends Store {
	public Costco(String type, String name) {
		super(type, name);
	}
	
	public void workingHours() {
		System.out.println(name + " works from 8am till 8pm");
	}
}


class Amazon extends Store {
	public Amazon(String type, String name) {
		super(type, name);
	}
	
	public void workingHours() {
		System.out.println(name + " works 24/7");
	}
}

public class UserDefineClassesInMap {

	public static void main(String[] args) {
		//we want to store stores in form amazon; costco; nike
		
		Map <Integer, Store> storeMap = new LinkedHashMap<>();
		storeMap.put(1, new Amazon("online", "Amazon"));
		storeMap.put(2, new Costco("wholesale", "Costco"));
		storeMap.put(3, new Nike("retail", "Nike"));
		
		//to get an access to all methods of our Store Objects: .values(), keySet(), entrySet()
		
		// 1.way get all Value Objects
		Collection <Store> col = storeMap.values();
		for(Store s : col) {
			s.display();
			s.workingHours();
			System.out.println("----------------------------");
		}
		
		System.out.println("================================");
		
		//2.way get all Entry Objects
		Set <Entry<Integer, Store>> storeSet = storeMap.entrySet();
		for(Entry<Integer, Store> e : storeSet) {
			e.getValue().display();
			e.getValue().workingHours();
			System.out.println("----------------------------");
		}
		
		System.out.println("================================");
		
		//3.way get all Keys --> get value of specified key
		Set <Integer> keys = storeMap.keySet();
		for(int i : keys) {
			Store obj = storeMap.get(i);
			obj.display();
			obj.workingHours();
			System.out.println("----------------------------");
		}
		
	}
}
