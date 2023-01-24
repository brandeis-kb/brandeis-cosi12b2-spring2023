package edu.brandeis.cosi12b2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Live03 {

    public static void main(String[] args) {
        // testPrePostIncrement();
        // testStringConcatenation("Hello", "World");
        // testStringExample();
        // testStringEquals();
    	// testStringChange();
    	testAddDogs();
        
    }

    public static void testPrePostIncrement() {
        // ++a increments and then uses the variable.
        // a++ uses and then increments the variable.

        int a = 1;
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
    }

    public static void testStringConcatenation(String s1, String s2) {
        System.out.printf("concatenation of [%s] and [%s] is [%s] \n", s1, s2, s1 + s2);
    }

    public static void testStringExample() {
        String s1 = "hello";
        String s2 = "class";
        String s3 = "soon we’ll have the first holiday!";

        System.out.println(s1 + " " + s2 + " " + s3);
        System.out.println();

        //Use of the method length()
        String s4 = s1 + " " + s2 + " " + s3;
        int strLen = s4.length ();
        System.out.println("The length of the string s4 is: " + strLen);
        System.out.println();

        //Use of the method charAt(index)
        char ch = s4.charAt (3);
        System.out.println("The character in string s4 at location 3 is: " + ch);
        System.out.println();

        //Use of the method toUpperCase()
        String newString = s4.toUpperCase();
        System.out.println(newString);
    }

    public static void testStringEquals() {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = console.next();
        if (name == "Barney") {
            System.out.println("I love you, you love me,");
            System.out.println("We're a happy family!");
        }
    }
    
    public static void testStringChange() {
        String s1 = "Albert";
        testStringModification(s1);
        System.out.printf("'s1' in testStringChange is [%s]\n", s1);
    }

    // We've done a crummy thing - we said primitives get passed by value and
    // Strings get passed by reference which implies we should be able to modify 
    //*this* string and see the reference change. But we can't because Strings are immutable
    // but we *will* see this will other objects
    public static void testStringModification(String s1) {
        String s3 = s1;
    	
    	String s2 = s1.toLowerCase();
        System.out.printf("'s2' in testStringModification is [%s]\n", s2);

        s1 = s1.toLowerCase(); // now `s1` is a *new* reference that is not the same as old `s1`
        System.out.printf("'s1' in testStringModification is [%s]\n", s1);
        
        if (s3 == s1) {
        	System.out.println("==");
        } else {
        	System.out.println("not ==");        	
        }

        if (s3.equals(s1)) {
        	System.out.println("equals");
        } else {
        	System.out.println("not equals");
        }
    }
    
    public static void testAddDogs() {
        HashSet dogs = new HashSet();
        dogs.add("Bulldog");
        dogs.add("Labrador Retriever");
        printSet("before", dogs);
        testSet(dogs);
        printSet("after", dogs);
    }
    
    public static void testSet(HashSet dogs) {
    	dogs.add("German Shepard");
    	dogs.add("Doberman Pinscher");
    }
    
    public static void printSet(String title, HashSet set) {
    	Iterator itr = set.iterator();
    	 
    	System.out.printf("%s: ", title);
    	while (itr.hasNext()) {
            System.out.printf("%s ; ", itr.next());
        }
    	System.out.println();
    }

}
