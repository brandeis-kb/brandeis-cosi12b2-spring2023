package edu.brandeis.cosi12b2.lec05.ans;

import java.util.Arrays;

public class ArrayStatic {
    public static void main(String[] args) {
        int[] input = {1, 4, 0, 7};
        int[] output = twoCopies(input);

        System.out.println(Arrays.toString(output));
    }

    public static int[] twoCopies(int[] numbers) {
        int result[] = new int[numbers.length * 2];
        for (int i=0, j=0; i < numbers.length; i++, j+=2) {
            result[j] = numbers[i];
            result[j + 1] = numbers[i];
            // System.out.println(Arrays.toString(result));
        }
        return result;
    }
}
