package edu.brandeis.cosi12b2.lec05.ans;

import java.io.*;
import java.util.*;

public class Question02a {

    public static void main(String[] args) throws FileNotFoundException {
        // readFile("weather2.txt");
        readFile("./week03/live05/weather2a.txt");

    }

    public static void readFile(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        double prev = 1000.0;
        while (input.hasNext()) {
            if (input.hasNextDouble()) {
                if (prev == 1000.0) {
                    prev = input.nextDouble();
                } else {
                    double next = input.nextDouble();
                    System.out.println(prev + " to " + next + ", change = " + (next - prev));
                    prev = next;
                }
            } else {
                input.next();  // throw away unwanted token
            }
        }
    }

}