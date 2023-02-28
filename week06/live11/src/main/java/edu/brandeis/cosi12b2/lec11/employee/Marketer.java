package edu.brandeis.cosi12b2.lec11.employee;

// A class to represent marketers
public class Marketer extends Employee {

    public void advertise() {
        System.out.println("Act now while supplies last!");
    }

    // overrides getSalary from Employee class
    public double getSalary() {
        return 50000.0;      // $50,000 / year
    }

}
