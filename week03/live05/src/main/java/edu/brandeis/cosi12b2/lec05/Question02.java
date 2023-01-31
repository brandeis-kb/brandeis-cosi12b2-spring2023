package edu.brandeis.cosi12b2.lec05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * 
 * @author kbrumer
 * 
16.2 23.5
Tuesday 19.1  Wed 7.4  THURS.TEMP 22.8

18.5 -1.8 14.9
16.1
 *
 */
public class Question02 {

    public static void main(String[] args) throws FileNotFoundException {
    	readFile("weather2.txt");
    	PrintStream prinStream = new PrintStream(System.out);
    }

    public static void readFile(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        double prev = input.nextDouble();
        // System.out.printf("prev= %2.2f\n", prev);
        while (input.hasNext()) {
        	if (input.hasNextDouble()) {
            	double next = input.nextDouble();
                // System.out.printf("prev= %2.2f, next= %2.2f\n", prev, next);
                // calculation here
            	System.out.printf("%2.2f to %2.2f, change = %2.2f\n", prev, next, (next - prev));
                prev = next;
        	} else {
        		input.next();
        	}
        }

    }

}
