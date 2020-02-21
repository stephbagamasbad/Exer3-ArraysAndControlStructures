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
		char[] reverse = new char[chars.length];
		int temp = 0;
		for ( int i = chars.length-1; i >= 0; i-- ) {
			reverse[temp] = chars[i];
			//System.out.println(reverse[temp]);
			temp++;
		}

		boolean temp1 = false;
		for (int i = 0; i <= chars.length-1 ; i++) {
			//System.out.println(chars[i]);
			if(reverse[i] != chars[i]) {
				temp1 = false;
				break;
			}else {
				temp1 = true;
			}

			//System.out.println(temp1);
		}


		return temp1;
	}
}
