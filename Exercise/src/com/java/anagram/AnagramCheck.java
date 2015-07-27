/*
This is a program which implements logic to find if given two strings are Anagram. 
There are three different methods provided here. Each method provides different logic to find out Anagram.
Any of these three methods can be used to find Anagrams. A test program is implemented to provide various strings. 
 */

package com.java.anagram;
import java.util.Arrays;

public class AnagramCheck {
	public boolean isAnagram(String word, String anagram){
		if(word.length() != anagram.length()){
			return false; 
		}
		char[] chars = word.toCharArray(); 
		for(char c : chars){ 
			int index = anagram.indexOf(c); 
			if(index != -1){ 
				anagram = anagram.substring(0,index) + anagram.substring(index +1, anagram.length()); 
			}
			else{ 
				return false; 
			} 
		} 
		return anagram.isEmpty(); 
		} 
		public boolean iAnagram(String word, String anagram){ 
			char[] charFromWord = word.toCharArray(); 
			char[] charFromAnagram = anagram.toCharArray(); 
			Arrays.sort(charFromWord); 
			Arrays.sort(charFromAnagram); 
			return Arrays.equals(charFromWord, charFromAnagram);
		}
		public boolean checkAnagram(String first, String second){ 
			char[] characters = first.toCharArray(); 
			StringBuilder sbSecond = new StringBuilder(second); 
			for(char ch : characters){ 
				int index = sbSecond.indexOf("" + ch); 
				if(index != -1){ sbSecond.deleteCharAt(index); 
			}
				else{ 
					return false; 
				} 
			} 
			return sbSecond.length()==0 ? true : false; 
		} 
}
