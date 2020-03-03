package com.lotus.jbc.basicjava;

public class Palindrome {
	
	/**
	 * This method should determine if a given array of characters is a palindrome, and return 
	 * a corresponding boolean value.
	 * @param chars
	 * 			the given character array.
	 * @return boolean value:
	 * 		true - if the array is a palindrome.
	 * 		false - if the array is not a palindrome.
	 */
	public boolean determinePalindrome(char[] chars) {
		
		int length = chars.length;
		for (int index = 0; index < array.length; index++){
			int start = chars[index];
			int end = chars[--length];
			if (length < index){
				return true;
			}
			if (start != end){
				return false;
			}
		}
		
		return true;
		
	}
}
