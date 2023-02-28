package edu.brandeis.cosi12b2.lec05;

import java.util.Arrays;

public class ArrayStatic {
    public static void main(String[] args) {
        int[] input = {1, 4, 0, 7};
        int[] output = twoCopies(input);

        System.out.println(Arrays.toString(output));
    }

    public static int[] twoCopies(int[] numbers) {
        int[] result = {1, 2, 3};
        return result;
    }
}
