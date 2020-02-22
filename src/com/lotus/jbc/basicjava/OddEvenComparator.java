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

		String result = "";
		int evenCounter = 0;
		int oddCounter = 0;
		int checkRemainder = 0;

		for (int i = 0; i <= ints.length-1; i++){
			checkRemainder = ints[i] % 2;
			if (checkRemainder != 0){
				oddCounter++;
			}else {
				evenCounter++;
			}
		}

		if (oddCounter > evenCounter){
			result = "There are more odd integers.";
		}else if (oddCounter < evenCounter){
			result = "There are more even integers.";
		}else {
			result = "There are equal odd and even integers in the array.";
		}

		return result;
	}
}
