package com.java.looping;

public class ForLoop {
	
	public void oddNumber() {
		int i;
		System.out.println("Odd Numbers from 1 to 100 Using 'For' Loop are : ");
		for (i = 0; i <= 100; i++){
			if (i % 2 != 0){
				System.out.println(i);
			}
		}
	}

}
