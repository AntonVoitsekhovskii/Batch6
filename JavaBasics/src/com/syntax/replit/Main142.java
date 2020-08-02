package com.syntax.replit;

public class Main142 {

	 String iteam;
	    double price;
	    int quantity;
	    
	    Main142(String iteam, double price, int quantity) {
	      this.iteam = iteam;
	      this.price = price;
	      this.quantity = quantity;
	    }
	    
	    public double iteamTotalPrice() {
	    	double total = this.price * this.quantity;
	       return total;
	  
	    }
	    
	    public void print() {
	      System.out.println(iteam + " Total Value " + iteamTotalPrice());
	    }
	    
	}

