package edu.brandeis.cosi12b2.lec05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author kbrumer
 * 
16.2 23.5
19.1 7.4 22.8

18.5 -1.8 14.9


prev = 16.20, next = 23.5 , delta (???)
prev = 23.50, next = 19.1 , delta 

 *
 */
public class Question01 {

    public static void main(String[] args) throws FileNotFoundException {
    	readFile("weather.txt");
    }

    public static void readFile(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        double prev = input.nextDouble();
        // System.out.printf("prev= %2.2f\n", prev);
        while (input.hasNextDouble()) {
        	double next = input.nextDouble();
            // System.out.printf("prev= %2.2f, next= %2.2f\n", prev, next);
            // calculation here
        	System.out.printf("%2.2f to %2.2f, change = %2.2f\n", prev, next, (next - prev));
            prev = next;
        }

    }

}
