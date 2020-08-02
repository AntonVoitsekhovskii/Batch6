package com.syntax.class02;

import java.util.Scanner;

public class JavaRush {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int num1 = scan.nextInt();
	    int num2 = scan.nextInt();
	    int num3 = scan.nextInt();
	    int maxNum = 0, midNum = 0, minNum = 0;
	    int Max1 = Max(num1, num2);
	    
	    if(Max1 > num3) {
	        Max1 = maxNum;
	        num3 = midNum;
	        
	    }
	    }
	    
	    
	    
	    public static int Max(int a, int b) {
	        if (a > b) {
	            return a;
	        }
	        else {
	            return b;
	        }	
	}

}
