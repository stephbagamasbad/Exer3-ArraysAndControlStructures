package com.orangeandbronze.jbc.basicjava6;

public class Runner {

	public static void main(String[] args) {
		
		final int[] ints = {1,2,2,4};
		
		final OddEvenComparator comparator = new OddEvenComparator();
		final String majority = comparator.determineMajority(ints);
		System.out.println("OddEvenComparator.determineMajority: " + majority);
		
		final char[] chars = {'s','a','g','a','s'};
		
		final Palindrome palindrome = new Palindrome();
		final boolean result = palindrome.determinePalindrome(chars);
		System.out.println("Palindrome.determinePalindrome: " + result);
		
	}
}
