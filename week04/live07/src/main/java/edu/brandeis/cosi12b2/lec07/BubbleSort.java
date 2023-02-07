package edu.brandeis.cosi12b2.lec07;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = { 5, 1, 4, 2, 8 };
        bubbleSort(input);
    }

    public static void bubbleSort(int[] arr) {
        int didswap = 1, tmp = 0, passes = 1;
        while (didswap == 1) {
            didswap = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i - 1] > arr[i]) {
                    System.out.printf("[%d] Swapping [%d] and [%d]\n", passes, arr[i-1], arr[i]);
                    tmp = arr[i - 1]; // why `tmp` ?
                    arr[i - 1] = arr[i];
                    arr[i] = tmp;
                    didswap = 1;
                    System.out.println(Arrays.toString(arr));
                }
            }
            passes ++;
        }
    }

}