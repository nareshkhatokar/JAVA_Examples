package com.java.looping;

public class WhileLoop {
	public void oddNumber() {
		int i = 0;
		System.out.println("Odd Numbers from 1 to 100 Using 'While' Loop are : ");
		while (i < 100) {
			if (i % 2 != 0){
				System.out.println(i);
			}
			i++;			
		}
	}
}
