package edu.brandeis.cosi12b2.lec05.ans;

import java.util.Arrays;

public class ArrayLim {
    public static void main(String[] args) {
        int[] A = {126, 167, 95};
        int[] B = A;
        int[] C = {126, 167, 95};
        System.out.println("A location = " + A);
        System.out.println("B location = " + B);
        System.out.println("C location = " + C);
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.out.println(Arrays.toString(C));
    }
}
