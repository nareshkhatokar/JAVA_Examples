package com.java.overridingNoverloading;

public class OverLoadingTester extends Parent{

	public static void main(String[] args) {
		Parent parent = new Parent();
		parent.reserve();
		parent.reserve(10);
		parent.reserve("Sunday");

	}

}
