package edu.brandeis.cosi12b2.lec12;

public class Lawyer extends Employee {

    public Lawyer(int initialYears) {
        super(initialYears);
    }

	public double getSalary() {
		return super.getSalary() + 5000 * years;		
	}
	
}
