package com.syntax.class27;

public abstract class Food {

	public String name;
	
	public Food(String name) {
		this.name = name;
	}
	
	public abstract void buy(); 
	public abstract void cook();
	public abstract void wash();
	public abstract void display();
}

class Meat extends Food {
	public Meat(String name) {
		super(name);
	}
	
	public void buy() {
		System.out.println(name + " can be bought in butchery");
	} 
	
	public void cook() {
		System.out.println(name + " can be cooked in grill");
	} 
	
	public void wash() { 
		System.out.println(name + " has to be washed before cooked");
	}	
	
	public void display() {
		System.out.println(name);
	}
	
}

class Fruits extends Food {
	public Fruits(String name) {
		super(name);
	}
	
	public void buy() {
		System.out.println(name + " can be bought in farm");
	} 
	
	public void cook() {
		System.out.println(name + " does not need to be cooked");
	} 
	
	public void wash() { 
		System.out.println(name + " has to be washed before ate");
	}	
	
	public void display() {
		System.out.println(name);
	}
}

class Vegetables extends Food {
	public Vegetables (String name) {
		super(name);
	}
	
	public void buy() {
		System.out.println(name + " can be bought in farm too");
	} 
	
	public void cook() {
		System.out.println(name + " can be cooked on grill or can be ate like this");
	} 
	
	public void wash() { 
		System.out.println(name + " has to be washed before ate");
	}	
	
	public void display() {
		System.out.println(name);
	}
}

