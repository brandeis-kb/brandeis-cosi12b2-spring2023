package edu.brandeis.cosi12b2.lec07;

import java.util.Arrays;

public class ArrayExample {
    static int[] x = {1,  2,  3,  4};             
    static int[] y = {5,  6,  7,  8};             
    static int[] z = {9, 10, 11, 12};        
    
    int[] xx = {11, 12, 13, 14};
	
	
	public static void main(String[] args) {
		int[][] array2d = {
				x,
				y,
				z
		};

		printMatrix(array2d);
		matrixAddOne(array2d);
		printMatrix(array2d);
	}

	public static void printMatrix(int[][] array2d) {		
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[0].length; j++) {
				System.out.printf("index [%d, %d] = value %d, ", i, j, array2d[i][j]);
			}
			System.out.println();
		}		
	}

	public static void matrixAddOne(int[][] array2d) {		
		for (int i = 0; i < array2d.length; i++) {
			for (int j = 0; j < array2d[0].length; j++) {
				array2d[i][j]++;
			}
		}		
	}

	
	public static void testOne() {
		int[] testArray = { 1, 2, 6, 7 };		
		System.out.println(Arrays.toString(testArray));
		ArrayExample.evensAndOdds(testArray);
		System.out.println(Arrays.toString(testArray));
	}
	
	public static void addOneToArray(int[] input) {
		for (int i = 0; i < input.length; i++) {
			input[i] += 1;				
		}
	}
	
	// put evens on left hand side, odds on right
	public static void evensAndOdds(int[] input) {
		// { 1, 2, 6, 7 };
		//
		// { 2, 6, 1, 7 }
		int[] newArray = new int[input.length];
		int oddIndex = 0;
		int evenIndex = input.length - 1;
		for (int i = 0; i < input.length; i++) {
			if (input[i] % 2 == 0) {
				System.out.printf("[%d] is even!\n", input[i]);
				newArray[oddIndex++] = input[i];
			} else {
				System.out.printf("[%d] is odd!\n", input[i]);
				newArray[evenIndex--] = input[i];
			}
		}
		System.out.println("newArray=" + Arrays.toString(newArray));

	}

	public static void addOneToMatrix(int[][] matrix) {
//		for (int i = 0; i < input.length; i++) {
//			input[i] += 1;				
//		}
	}
	

}
