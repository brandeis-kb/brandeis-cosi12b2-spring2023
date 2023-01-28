package edu.brandeis.cosi12b2.lec06;

import java.util.Arrays;

// concatenate two arrays
public class GrowingAnArray {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3, 9};
        int[] a2 = {4, 5, 6, 7, 8};
        // a1 + a2 = { 5, 7, 9, 16, 8 } ? NO! We are not adding !!
        // a1 + a2 = { 1, 2, 3, 9, 4, 5, 6, 7, 8 };
        int[] answer = concatenate(a1, a2);
        System.out.println(Arrays.toString(answer));
    }

    public static int[] concatenate(int[] first, int[] second) {
        int[] a1 = new int[first.length + second.length];
        int i = 0;
        for (i=0; i < first.length; i++) {
            a1[i] = first[i];
        }
        for (int j=0; j < second.length; j++) {
            a1[i + j] = second[j];
        }
        return a1;
    }
}
