package edu.brandeis.cosi12b2.lec06;

public class EqualityTest {
    public static void main(String[] args) {
        testStrings();
        testArrays();
    }

    public static void testStrings() {
        String s1 = "ABC";
        String s2 = "ABC";
        String s3 = new String("ABC");

        System.out.print("String Test if s1 == s2: ");
        if (s1 == s2){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        System.out.print("String Test if s1 == s3: ");
        if (s1 == s3){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void testArrays() {
        int[] A = {1, 2, 3};
        int[] B = {1, 2, 3};
        int[] C = {1, 2, 3};

        System.out.print("Array Test if A == B: ");
        if (A == B){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        System.out.print("Array Test if A == C: ");
        if (A == C){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
