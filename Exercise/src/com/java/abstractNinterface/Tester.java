/*This is tester to check implementation of abstract classes. It is child class of ChildAbstract class 
*/
package com.java.abstractNinterface;

public class Tester extends ChildAbstract {

	public static void main(String[] args) {
/*		ChildAbstract childClass = new ChildAbstract();
		childClass.display();
		childClass.clock();
		System.out.println("Exiting Child class");
*/		
	Tester test = new Tester();
	test.clock();
	test.display();
	}
}
