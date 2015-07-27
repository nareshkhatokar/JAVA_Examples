/*
This is a program to swap contents of two string variables without using third or temporary variable.
Two ways used in this program to swap string variables are substring and concatenate functionalities. 
Just change values of first and second variables. There is NO separate tester class included to check/Verify this program. 
 */

package com.java.swapStrings;

public class SwapStrings {
	public String a = null;
	public String b = null;

	public static void main(String[] args) {
		String first = null;
		String second = null;
		SwapStrings sw = new SwapStrings();
		first = "Naresh";					//Change values if required
		second = "Pioneer";					//Change values if required

//---------------Calling Swap method using substring--------------//
		System.out.println("Given String were '" + first + "' and '" + second + "'.");
		sw.swapStringSubString(first, second);
		System.out.println("After Swapping using substring method, Strings are '" + sw.a + "' and '" + sw.b + "'.");
		
//---------------Calling Swap method using Concatenate--------------//
		System.out.println("Given String were '" + first + "' and '" + second + "'.");
		sw.swapStringConcatenate(first, second);
		System.out.println("After Swapping using Concatenate method, Strings are '" + sw.a + "' and '" + sw.b + "'.");
	}
	
	public void swapStringSubString(String first, String second){
		a = first;
		b = second;
		a = a + b;
	    b = a.substring(0,(a.length()-b.length())); 
	    a = a.substring(b.length(),(a.length()));
	}

	public void swapStringConcatenate(String first, String second){
		a = first;
		b = second;
		a = a.concat("#" + b);
		b = a.split("#")[0];
		a = a.split("#")[1];
	}
}
