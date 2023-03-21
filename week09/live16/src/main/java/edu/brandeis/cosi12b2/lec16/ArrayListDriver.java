package edu.brandeis.cosi12b2.lec16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDriver {
    private List<String> words = new ArrayList<String>();

    public static void main(String[] args) {
        testAddDrive1();
        // testAddDrive2();
        // testRemoveDrive1();
        // testRemoveDrive2();
    }

    public static void testAddDrive1() {
        ArrayListDriver driver1 = new ArrayListDriver();
        driver1.populate1();
        driver1.testAdd1();
        driver1.display(99);
    }

    public static void testAddDrive2() {
        ArrayListDriver driver1 = new ArrayListDriver();
        driver1.populate1();
        driver1.testAdd2();
        driver1.display(99);
    }

    public void testAdd1() {
        for (int i=0; i < words.size() && i < 15; i++) {
            words.add(i,"~");
            display(i);
        }
    }

    public void testAdd2() {
        for (int i=0; i < words.size(); i+=2) {
            words.add(i,"~");
            display(i);
        }
    }

    public static void testRemoveDrive1() {
        ArrayListDriver driver1 = new ArrayListDriver();
        driver1.populate2();
        driver1.testRemove1();
        driver1.display(99);
    }

    public static void testRemoveDrive2() {
        ArrayListDriver driver1 = new ArrayListDriver();
        driver1.populate2();
        driver1.testRemove2();
        driver1.display(99);
    }

    public void testRemove1() {
        for (int i=0; i < words.size(); i+=2) {
            words.remove(i);
            display(i);
        }
    }

    public void testRemove2() {
        for (int i=0; i < words.size(); i++) {
            words.remove(i);
            display(i);
        }
    }
    
    public void populate1() {
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
    }

    public void populate2() {
        words.add("~");
        words.add("four");
        words.add("~");
        words.add("score");
        words.add("~");
        words.add("and");
        words.add("~");
        words.add("seven");
        words.add("~");
        words.add("years");
        words.add("~");
        words.add("ago");
    }

    public void display(int i){
        if (i == 99) {
            System.out.printf("At final step, words is => %s \n", words);
        } else {
            System.out.printf("At step %d, words is => %s \n", i, words);
        }
    }

}
