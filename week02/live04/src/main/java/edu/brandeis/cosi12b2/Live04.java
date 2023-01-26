package edu.brandeis.cosi12b2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Live04 {
    public static void main(String[] args) throws FileNotFoundException {
        //for (int i = 0; i < 100; i++) {
        //    testRandom();
        //}
        // testWriteFile();
        // testReadFile();
        // testReadFile2();
    	testReadFile3();
    }

    public static void testRandom() {
        Random rand = new Random(); // jump into class declaration
        int randomNumber = rand.nextInt(10); // jump into method declaration
        // If we want to learn how to write code, learn how to read code
        System.out.printf("[%d] ", randomNumber); // 0-9
    }

    public static void testWriteFile() throws IOException {
        File f = new File("example.txt");
        f.createNewFile();
    	System.out.println("Done");
        System.out.printf("File written to [%s]!", f.getAbsolutePath());
        // right click, hit refresh and then it shows up
    }
    
    public static void testReadFile() throws FileNotFoundException {
    	Scanner input = new Scanner(new File("data.txt")); 
    	String text = input.next(); 
    	System.out.println(text);
    }

    public static void testReadFile2() throws FileNotFoundException {
    	Scanner input = new Scanner(new File("data.txt"));
    	int i = 0;
    	while (input.hasNextLine()) {
            String line = input.nextLine();
            System.out.printf("%02d: %s \n", i, line);
            i++;
        }    
    }

    public static void testReadFile3() throws FileNotFoundException {
    	Scanner input = new Scanner(new File("data1.txt")); 
    	for (int i=0; input.hasNextLine(); i++) {
            String line = input.nextLine();
            System.out.printf("%02d: %s \n", i, line);
        }    
    }

}
