package edu.brandeis.cosi12b2.lec11.employee;

// A class to represent legal secretaries
public class LegalSecretary extends Secretary {
    public void fileLegalBriefs() {
        System.out.println("I could file all day!");
    }

    public double getSalary() {
        return 45000.0;      //$45,000.00
    }
}
