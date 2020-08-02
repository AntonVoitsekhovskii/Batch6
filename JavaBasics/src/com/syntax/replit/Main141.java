package com.syntax.replit;

public class Main141 {
	
	String model;
	  double price;
	  int quantity;
	 // double value;
	  
	  Main141(String model, double price, int quantity) {
	    this.model = model;
	    this.price = price;
	    this.quantity = quantity;
	  }
	  
	  public double carStockValue() {
	    double value = price * quantity;
	    //this.value = value;
	    return value;
	  }
	  
	  public void print() {
		  System.out.println(model + " " + quantity + " " + price + " " + carStockValue());
	  }
}
