package com.syntax.replit;

public class Main138 {
	
	String label;
	  double price;
	  String category;
	  boolean hasExpiration = false;
	  int stock;
	  
	  Main138(String label, double price, String category, boolean hasExpiration, int stock) {
		  this.label = label;
		  this.price = price;
		  this.category = category;
		  this.hasExpiration = hasExpiration;
		  this.stock = stock;
	 }
	  
	  
	  Main138(String label, double price, int stock) {
		  this.label = label;
		  this.price = price;
		  this.category = "misc";
	      this.hasExpiration = hasExpiration;
	      this.stock = stock;
	  }
	  
	  Main138(String label, double price) {
		  this.label = label;
		  this.price = price;
		  this.category = category;
	      this.hasExpiration = hasExpiration;
	      this.stock = stock;
	  }
	  
	  void displayMeth() {
	    System.out.println(label + " " + price + " " + category + " " + hasExpiration + " " + stock);
	  }
	  
	  
	}

