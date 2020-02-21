package com.lotus.jbc.basicjava;

import java.util.Arrays;

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
		// Modify content of this method
		Boolean isPalindrome = false;
		int ctrA;
		int ctrB = chars.length - 1;
		char[] charsCompare = new char[chars.length];

		// Store chars in reverse order to charsCompare
		for (ctrA = 0; ctrA < chars.length; ctrA++) {
			charsCompare[ctrB] = chars[ctrA];
			ctrB--;
		}

		// Compares both arrays if equal
		for (ctrA = 0; ctrA < chars.length; ctrA++) {
			if (charsCompare[ctrA] == chars[ctrA]) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				break;
			}
		}

		// Return value of isPalindrome
		return isPalindrome;
	}
}
