package com.java.stings;

public class StringOperation {
	
	public static void main(String[] args) {
	String name = new String();
	StringBuffer bufferName = new StringBuffer();
	StringBuilder builderName = new StringBuilder();
	
	builderName.append("StringBuilder ");
	bufferName.append("StringBuffer");
	name = "Naresh";
	System.out.println("Length of String --> " + name.length());
	System.out.println("Length of StringBuffer --> " + builderName.length());
	System.out.println("Length of StringBuilder --> " + bufferName.length());
	}
}
