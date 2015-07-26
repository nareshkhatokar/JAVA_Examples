package com.java.overridingNoverloading;

public class Child extends Parent{
	
	@Override
	public void reserve(int discount){
		System.out.println("In Child Class - Reserve with discount method " + discount + "%");
	}
	@Override
	public void reserve(String day){
		System.out.println("In Child Class - Reserve on a day method " + day);
	}
}
