package edu.brandeis.cosi12b2.lec13.employee;

// A class to represent secretaries
public class Secretary extends Employee {
    
	public Secretary(int years) {
        super(years);
        System.out.println("Secretary constructor called");
    }
	
	public int getSeniorityBonus() {
        return 0;
	}

    public void takeDictation(String text) {
        System.out.println("Taking dictation of text: " + text);
    }
}