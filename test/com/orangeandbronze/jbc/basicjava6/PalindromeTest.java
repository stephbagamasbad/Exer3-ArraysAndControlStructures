package com.orangeandbronze.jbc.basicjava6;

import junit.framework.TestCase;

public class PalindromeTest extends TestCase {
	
	/*
	 * Test method for 'com.orangeandbronze.jbc.basicjava6.Palindrome.determinePalindrome(int[])'
	 */
	public void testDeterminePalindrome(){
		final Palindrome palindrome = new Palindrome();
		final char[] chars = {'a','n','n','a'};
		boolean actual = palindrome.determinePalindrome(chars);
		boolean expected = true;
		assertEquals(expected, actual);	
		
		final char[] chars2 = {'a','n','a','a'};
		actual = palindrome.determinePalindrome(chars2);
		expected = false;
		assertEquals(expected, actual);
		
		final char[] chars3 = {'r','a','d','a','r'};
		actual = palindrome.determinePalindrome(chars3);
		expected = true;
		assertEquals(expected, actual);
		
		final char[] chars4 = {'r','a','d','r','r'};
		actual = palindrome.determinePalindrome(chars4);
		expected = false;
		assertEquals(expected, actual);	
	}
}
