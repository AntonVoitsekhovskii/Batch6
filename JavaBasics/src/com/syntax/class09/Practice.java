package com.syntax.class09;

public class Practice {

	public static void main(String[] args) {
		 for(int i = 0; i < 24; i++) {
			 for(int j = 0; j < 60; j++) {
				 if(j<10) {
					 System.out.println(i + ":0" + j);
				 }
				 else {
					 System.out.println(i + ":" + j);
				 }
			 }
		 }

	}

}
