/*
Class implementing interface. It provides definition of all abstract methods in interface.
 */

package com.java.abstractNinterface;

public class ChildInterfaceClass implements ParentInterface {

	@Override
	public void time() {
		System.out.println("In Time Method of ChildInterface");
	}

	@Override
	public void clock() {
		System.out.println("In Clock Method of ChildInterface");
	}

}
