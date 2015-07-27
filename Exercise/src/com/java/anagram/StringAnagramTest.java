/*
This is a tester class which provides various String inputs to test AnagramCheck program.
 */

package com.java.anagram;

public class StringAnagramTest {

	public static void main(String[] args) {
		boolean anagramStatus;

//----------------First Round of Strings------------------//		
		System.out.println("===========First set of Strings==============");
		String first = "Naresh";
		String second = "areshN";
		
		AnagramCheck ac = new AnagramCheck();
		System.out.println("Using checkAnagram Method -->");
		anagramStatus = ac.checkAnagram(first, second);
		if (anagramStatus){
			System.out.println("Given Strings '" + first + "' and '" + second + "' are Anagram");			
		}
		else {
			System.out.println("Given Strings '" + first + "' and '" + second + "' are NOT Anagram");
		}
		System.out.println("Using iAnagram Method -->");
		anagramStatus = ac.iAnagram(first, second);
		if (anagramStatus){
			System.out.println("Given Strings '" + first + "' and '" + second + "' are Anagram");			
		}
		else {
			System.out.println("Given Strings '" + first + "' and '" + second + "' are NOT Anagrams");
		}
		System.out.println("Using isAnagram Method -->");
		anagramStatus = ac.isAnagram(first, second);
		if (anagramStatus){
			System.out.println("Given Strings '" + first + "' and '" + second + "' are Anagrams");			
		}
		else {
			System.out.println("Given Strings '" + first + "' and '" + second + "' are NOT Anagrams");
		}

		
//----------------Second Round of Strings------------------//		
		System.out.println("==============Second set of Strings================");
		first = "next";
		second = "nest";
		
		System.out.println("Using checkAnagram Method -->");
		anagramStatus = ac.checkAnagram(first, second);
		if (anagramStatus){
			System.out.println("Given Strings '" + first + "' and '" + second + "' are Anagram");			
		}
		else {
			System.out.println("Given Strings '" + first + "' and '" + second + "' are NOT Anagram");
		}
		System.out.println("Using iAnagram Method -->");
		anagramStatus = ac.iAnagram(first, second);
		if (anagramStatus){
			System.out.println("Given Strings '" + first + "' and '" + second + "' are Anagram");			
		}
		else {
			System.out.println("Given Strings '" + first + "' and '" + second + "' are NOT Anagrams");
		}
		System.out.println("Using isAnagram Method -->");
		anagramStatus = ac.isAnagram(first, second);
		if (anagramStatus){
			System.out.println("Given Strings '" + first + "' and '" + second + "' are Anagrams");			
		}
		else {
			System.out.println("Given Strings '" + first + "' and '" + second + "' are NOT Anagrams");
		}
		
	}
}
