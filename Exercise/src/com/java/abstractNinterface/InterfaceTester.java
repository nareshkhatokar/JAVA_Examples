/*
This is a class to test interface and the class implementing interface.
 */

package com.java.abstractNinterface;

public class InterfaceTester extends ChildInterfaceClass{

	public static void main(String[] args) {
		InterfaceTester intTest = new InterfaceTester();
		intTest.clock();
		intTest.time();
		System.out.println("Exiting Interface Tester");
	}

}
