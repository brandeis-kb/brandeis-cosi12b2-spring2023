package edu.brandeis.cosi12b2.lec06;

import java.util.Arrays;

// Returns the digit value that occurs most frequently in n
// Breaks ties by choosing the smaller value
// (Question: what is this was larger value?) gte, backwards

public class ArrayCount01 {
    public static void main(String[] args) {
        // int input = 57135203;
        int input = 669260267;
        int digit = mostFrequentDigit(input);
        System.out.printf("This answer is [%d]\n", digit);
    }

    public static int mostFrequentDigit(int input) {
    	int digit = 0; 
    	int[] digitCount = new int[10];
    	// 0 0 0 0 0 0 0 0 0 0  <- array 
    	// 0 1 2 3 4 5 6 7 8 9  <- digit to look for 
    	// 0 0 0 0 0 0 0 0 0 0   
    	// 0 0 0 1 0 0 0 0 0 0  5713520 3 digitCount[3] ++; digitCount[digit]++
    	// 1 0 0 1 0 0 0 0 0 0  571352 0  digitCount[digit]++    
    	while (input > 0) {
    		digit = input % 10; // digit 3
    		input = input / 10; // input 571352
    		digitCount[digit]++; 
    		// System.out.printf("\n\ndigit[%d] input[%d]\n", digit, input);
    	}
    	System.out.println(Arrays.toString(digitCount));
    	return mostFrequent(digitCount);
    }

    public static int mostFrequent(int[] digitCount) {
    	int bestIndex = 0;
    	for (int i=0; i < digitCount.length; i++) {
    		if (digitCount[i] > digitCount[bestIndex]) {
    			// ???? 
    			bestIndex = i;
    		}
    	}
    	return bestIndex;
    }

}
