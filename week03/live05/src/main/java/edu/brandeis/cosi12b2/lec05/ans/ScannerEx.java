package edu.brandeis.cosi12b2.lec05.ans;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) throws FileNotFoundException{
        // scanFile("input.txt");
        scanFile("./week03/live05/input.txt");
    }

    public static void scanFile(String filename) throws FileNotFoundException {
        Scanner input = new Scanner(new File(filename));
        while (input.hasNextLine()) {
            String line = input.nextLine();
            Scanner lineScan = new Scanner(line);
            // process the contents of this line
            int count = 0;
            while (lineScan.hasNext()) {
                String word = lineScan.next();
                count++;
            }
            System.out.println("Line has " + count + " words");
        }

    }

}
