package com.orangeandbronze.jbc.basicjava6;

import junit.framework.TestCase;

public class OddEvenComparatorTest extends TestCase {
	
	/*
	 * Test method for 'com.orangeandbronze.jbc.basicjava6.OddEvenComparator.determineMajority(int[])'
	 */
	public void testGetMajority(){
		
		final OddEvenComparator comparator = new OddEvenComparator();
		final int[] ints  = {1,1,1,4};
		String actual = comparator.determineMajority(ints);
		String expected = "There are more odd integers.";
		assertEquals(expected, actual);
		
		final int[] ints2 = {2,3,4,6};
		actual = comparator.determineMajority(ints2);
		expected = "There are more even integers.";
		assertEquals(expected, actual);
		
		final int[] ints3 = {1,2,3,4};
		actual = comparator.determineMajority(ints3);
		expected = "There are equal odd and even integers in the array.";
		assertEquals(expected, actual);
	}
}
