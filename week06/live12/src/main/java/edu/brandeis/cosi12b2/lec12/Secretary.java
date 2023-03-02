package edu.brandeis.cosi12b2.lec12;

// A class to represent secretaries
public class Secretary extends Employee {
    public Secretary() {
        super(0);
    }

    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
}