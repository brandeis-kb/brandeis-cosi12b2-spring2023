package edu.brandeis.cosi12b2.lec16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDriver {

	public static void main(String[] args) {
		int[] foo = {1, 2, 3};
		int y = foo.length;
		
        List<String> words = new ArrayList<String>();
		words.size();
		
		for (int i=0; i<10; i++) {
			int j = 0;
		}
		
		// int k = j;
		
        // testAddDrive1();
        testAddDrive2();
        // testRemoveDrive1();
        // testRemoveDrive2();
    }

    public static void testAddDrive1() {
        List<String> words = new ArrayList<String>();
        populate1(words);
        testAdd1(words);
        display(words, 99);
    }

    public static void testAddDrive2() {
        List<String> words = new ArrayList<String>();
        populate1(words);
        testAdd2(words);
        display(words, 99);
    }

    public static void testAdd1(List<String> words) {
        for (int i=0; i < words.size() && i < 15; i++) {
            words.add(i,"~");
            display(words, i);
        }
    }

    public static void testAdd2(List<String> words) {
        for (int i=0; i < words.size(); i+=2) {
            words.add(i,"~");
            display(words, i);
        }
    }

//    public static void testRemoveDrive1() {
//        ArrayListDriver driver1 = new ArrayListDriver();
//        driver1.populate2();
//        driver1.testRemove1();
//        driver1.display(99);
//    }
//
//    public static void testRemoveDrive2() {
//        ArrayListDriver driver1 = new ArrayListDriver();
//        driver1.populate2();
//        driver1.testRemove2();
//        driver1.display(99);
//    }
//
//    public void testRemove1(List<String> words) {
//        for (int i=0; i < words.size(); i+=2) {
//            words.remove(i);
//            display(i);
//        }
//    }
//
//    public void testRemove2(List<String> words) {
//        for (int i=0; i < words.size(); i++) {
//            words.remove(i);
//            display(i);
//        }
//    }
//    
    public static void populate1(List<String> words) {
        words.add("four");
        words.add("score");
        words.add("and");
        words.add("seven");
        words.add("years");
        words.add("ago");
    }

    public static void populate2(List<String> words) {
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

    public static void display(List<String> words, int i){
        if (i == 99) {
            System.out.printf("At final step, words is => %s \n", words);
        } else {
            System.out.printf("At step %d, words is => %s \n", i, words);
        }
    }

}
