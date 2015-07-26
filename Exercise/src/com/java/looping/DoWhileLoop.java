package com.java.looping;

public class DoWhileLoop {
	public void oddNumber() {
		int i = 0;
		System.out.println("Odd Numbers from 1 to 100 Using 'Do While' Loop are : ");
		do {
			if (i % 2 != 0){
				System.out.println(i);
			}
			i++;			
		} while (i < 100);
		
	}
}
