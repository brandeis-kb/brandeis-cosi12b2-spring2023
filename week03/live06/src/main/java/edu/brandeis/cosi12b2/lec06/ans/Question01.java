package edu.brandeis.cosi12b2.lec06.ans;

import java.util.Arrays;

// Write a method increase that accepts one array of integers and returns the
// same array with all the element values increased by 2
public class Question01 {
    public static void main(String[] args) {
        int[] input = {1, 2, 3};
        System.out.println(Arrays.toString(input));
        increase(input);
        System.out.println(Arrays.toString(input));

    }

    public static void increase(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 2;
        }
    }
}
