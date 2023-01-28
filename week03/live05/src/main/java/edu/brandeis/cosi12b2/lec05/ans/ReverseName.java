package edu.brandeis.cosi12b2.lec05.ans;

public class ReverseName {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public static void reverseString(String input) {
        char ch;
        String output = "";

        for (int i=0; i<input.length(); i++) {
            ch = input.charAt(i);
            output = output + ch;
        }
    }
}
