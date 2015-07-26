package com.java.overridingNoverloading;

public class OverridingTester extends Child {

	public static void main(String[] args) {
		Child child = new Child();
		child.reserve();
		child.reserve(1);
		child.reserve("Sunday");
	}
}
