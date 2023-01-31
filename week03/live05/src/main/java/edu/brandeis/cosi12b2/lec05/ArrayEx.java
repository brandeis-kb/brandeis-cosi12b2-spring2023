package edu.brandeis.cosi12b2.lec05;

public class ArrayEx {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 5};
		double avg = average(numbers);
		// %d int
		// %s is for a string
		// %f is for a float or double
		// m.n for spacing ^^ for numeric, where m is before the decimal, n is after
		System.out.printf("Avg = [%2.2f]\n", avg);
	}
	
	public static double average(int[] input) {
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			int element = input[i];
			sum = sum + element;
		}
		double avg = sum * 1.0 / input.length;
		return avg;
	}
}
