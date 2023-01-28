package edu.brandeis.cosi12b2.lec05.ans;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question01 {

    public static void main(String[] args) throws FileNotFoundException {
        // readFile("weather.txt");
        readFile("./week03/live05/weather.txt");
    }

    public static void readFile(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        double prev = input.nextDouble();
        while (input.hasNextDouble()) {
            double next = input.nextDouble();
            System.out.println(prev + " to " + next + ", change = " + (next - prev));
            prev = next;
        }
    }
}
