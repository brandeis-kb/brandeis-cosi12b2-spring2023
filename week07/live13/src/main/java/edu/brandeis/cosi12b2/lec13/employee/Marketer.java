package edu.brandeis.cosi12b2.lec13.employee;

// A class to represent marketers
public class Marketer extends Employee {
	
    public Marketer(int years) {
        super(years);
    }

    public void advertise() {
        System.out.println("Act now while supplies last!");
    }

    public double getSalary() {
    	return super.getSalary() + 10000.0;
    }
}