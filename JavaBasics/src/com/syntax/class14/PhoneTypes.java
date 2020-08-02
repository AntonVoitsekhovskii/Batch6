package com.syntax.class14;

public class PhoneTypes {

	 
		
	public static void main(String[] args) {
		
		Phone iPhone = new Phone();
		iPhone.name = "iPhone XS MAX";
		iPhone.OS = "iOS";
		iPhone.price = "$1300";
		
		Phone Android = new Phone();
		Android.name = "Pixel";
		Android.OS = "Android";
		Android.price = "$1000";
		
		Phone Nokia = new Phone();
		Nokia.name = "6600";
		Nokia.OS = "Symbian";
		Nokia.price = "$120";
		
		Nokia.ring();
		Android.ring();
		iPhone.ring();

	}
}

		class Phone {
			String name;
			String OS;
			String price; 
	
			void ring() {
				System.out.println(name + " can ring!");
			}
		}

	