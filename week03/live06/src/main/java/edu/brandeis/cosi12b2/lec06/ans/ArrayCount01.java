package edu.brandeis.cosi12b2.lec06.ans;

import java.util.Arrays;

// Returns the digit value that occurs most frequently in n
// Breaks ties by choosing the smaller value
// (Question: what is this was larger value?) gte, backwards

public class ArrayCount01 {
    public static void main(String[] args) {
        int input = 57135203;
        int digit = mostFrequentDigit(input);
        System.out.printf("This answer is [%d]\n", digit);
    }

    public static int mostFrequentDigit(int input) {
        int[] countOfDigits = new int[10];
        int digit = 0, old = 0;
        while (input > 0) {
            digit = input % 10;
            old = input;
            countOfDigits[digit]++;
            input = input / 10;
            System.out.printf("\n\ndigit[%d] old[%d] input[%d]\n", digit, old, input);
            System.out.println(Arrays.toString(countOfDigits));
        }
        System.out.println(Arrays.toString(countOfDigits));
        return mostFrequent(countOfDigits);
    }

    public static int mostFrequent(int[] countOfDigits) {
        int bestIndex = 0;
        for (int i=0; i < countOfDigits.length; i++) {
            if (countOfDigits[i] > countOfDigits[bestIndex]) {
                bestIndex = i;
            }
        }
        return bestIndex;
    }

}
