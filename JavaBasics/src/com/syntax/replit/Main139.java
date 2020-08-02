package com.syntax.replit;

public class Main139 {
	
	String dogName;
	  double dogWeight;
	  static String dogBreed = "Mutt";
	  
	  Main139(String name, double weight) {
	    this.dogName = name;
	    this.dogWeight = weight;
	  }
	  
	  void display() {
	    System.out.println(dogName + " " + dogBreed + " " + dogWeight);
	  }
	}
