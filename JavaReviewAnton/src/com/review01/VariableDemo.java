package com.review01;

public class VariableDemo {
	public static void main(String[] args) {
		checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        if (a > 50 && a < 100) {
           // if (a < 100) {
                System.out.println("Число а содержится в интервале.");
           // }
        }
        else {
            System.out.println("Число а не содержится в интервале.");
        }
    }
	}

