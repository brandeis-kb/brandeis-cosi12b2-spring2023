package edu.brandeis.cosi12b2.lec05.ans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintStreamEx {
    public static void main(String[] args) throws FileNotFoundException{
        printFile("data.txt");
    }

    public static void printFile(String filename) throws FileNotFoundException {
        PrintStream out1 = System.out;
        PrintStream out2 = new PrintStream(new File(filename));
        out1.println("Hello, console!"); // goes to console
        out2.println("Hello, file!"); // goes to file
    }
}
