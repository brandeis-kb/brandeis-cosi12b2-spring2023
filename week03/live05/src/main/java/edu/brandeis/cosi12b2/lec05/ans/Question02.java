package edu.brandeis.cosi12b2.lec05.ans;

import java.io.*;
import java.util.*;

public class Question02 {

    public static void main(String[] args) throws FileNotFoundException {
        // readFile("weather2.txt");
        readFile("./week03/live05/weather2.txt");

    }

    public static void readFile(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        double prev = input.nextDouble();
        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                double next = input.nextDouble();
                System.out.println(prev + " to " + next + ", change = " + (next - prev));
                prev = next;
            } else {
                input.next();  // throw away unwanted token
            }
        }
    }

}