package com.syntax.class33;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HandlingException {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {			
		}
		
		String fPath = "";
		
		try {
			FileInputStream fis = new FileInputStream(fPath);
		}
		catch (FileNotFoundException fne) {			
		}
		

	}

}
