package edu.brandeis.cosi12b2.lec06;

import java.util.Arrays;

public class ArrayShift {
    public static void main(String[] args) {
        int[] numSold = {15, 8, 19, 2, 5, 8, 11, 18,7, 16};
        // answer should be
        // int[] numSold = {0, 15, 8, 19, 2, 5, 8, 11, 18,7};
        // if we set numSold[1] = 15 what happens to the 8 ??
        // since we are *overwriting* this array
        arrayShift02(numSold);
        System.out.println(Arrays.toString(numSold));
    }

    public static void arrayShift01(int[] input) {
    	int[] output = new int[input.length];
    	// 0. {15, 8, 19, 2, 5, 8, 11, 18,7, 16}
    	// 1. {15, 8 -> 15, 19 -> 15, 2 -> 15, 5, 8, 11, 18,7, 16}
        for (int i = 1; i < input.length; i++) {
            input[i] = input[i-1];
        }
    	input[0] = 0;
    }

    public static void arrayShift02(int[] input) {
        for (int i = input.length - 1; i > 0; i--) {
            input[i] = input[i-1];
        }
        input[0] = 0;
    }

}
