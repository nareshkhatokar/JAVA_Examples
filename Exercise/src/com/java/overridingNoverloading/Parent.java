package com.java.overridingNoverloading;

public class Parent {
	public void reserve(){
		System.out.println("In Parent Class - Reserve without discount method");
	}
	public void reserve(int discount){
		System.out.println("In Parent Class - Reserve with discount method " + discount + "%");
	}
	public void reserve(String day){
		System.out.println("In Parent Class - Reserve on a day method " + day);
	}
}
