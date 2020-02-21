package com.lotus.jbc.basicjava;

public class OddEvenComparator {
	
	/**
	 * This method should compare the number of odd and even integers from a given array, and return
	 * a corresponding String value. 
	 * @param ints
	 * 			the given integer array. 
	 * @return String value of:
	 * 			"There are equal odd and even integers in the array." - if the number of odd and even integers 
	 * 																	are equal.
	 * 			"There are more odd integers." - if the number of odd integers is more than 
	 * 											the number of even integers.
	 * 			"There are more even integers." - if the number of even integers is more than 
	 * 											 the number of odd integers.
	 */
	public String determineMajority(int[] ints){
	
		// Modify content of this method
		int odds = 0;
		int evens = 0;
		String theMajority = "";

		// Acquire number of odd and even integers from the ints Array
		for (int ctr = 0; ctr < ints.length; ctr++) {
			if (ints[ctr]%2 == 0) {
				evens++;
			}
			else {
				odds++;
			}
		}

		// Compare the count of odds and evens, then assign correct string
		if (odds > evens) {
			theMajority = "There are more odd integers.";
		}
		else if (evens > odds) {
			theMajority = "There are more even integers.";
		}
		else {
			theMajority = "There are equal odd and even integers in the array.";
		}

		// Return the value of the string
		return theMajority;
	}
}
