package edu.brandeis.cosi12b2.lec12;

// A class to represent secretaries
class Secretary extends Employee {
    
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