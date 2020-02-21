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

		char[] temp_chars = new char[chars.length];
		boolean isPalindrome = false;
		int temp_length = chars.length-1;

		for (int i = 0; i < chars.length; i++) {
				temp_chars[i] = chars[temp_length];

				if (chars[i] != temp_chars[i]) {
					isPalindrome =false;
					break;
				} else {
					isPalindrome = true;
				}
			temp_length--;
			}
		return isPalindrome;
}
}
