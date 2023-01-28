package edu.brandeis.cosi12b2.lec05.ans;

public class ArrayEx02 {
    public static void main(String[] args) {
        int[] numbers = { 4 , 5, 6 };
//        int[] numbers = new int[3];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
        double avg = average(numbers);
        System.out.printf("average is [%2.2f]\n", avg);
    }

    public static double average(int[] numbers) {
        int sum = 0;
        for (int i =0 ; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / numbers.length;
        return average;
    }
}
