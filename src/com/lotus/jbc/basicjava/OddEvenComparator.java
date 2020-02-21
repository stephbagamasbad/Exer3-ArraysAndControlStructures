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

		int evenCount = 0;
		int oddCount = 0;
		String majority = "";

		for (int i=0; i < ints.length; i++) {
			if (ints[i]%2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}

		if (evenCount == oddCount) {
			majority = "There are equal odd and even integers in the array.";
		} else if (evenCount < oddCount) {
			majority = "There are more odd integers.";
		} else {
			majority = "There are more even integers.";
		}

		return majority;
	}
}
