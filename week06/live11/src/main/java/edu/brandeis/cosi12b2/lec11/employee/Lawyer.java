package edu.brandeis.cosi12b2.lec11.employee;

public class Lawyer extends Employee {
    // overrides getVacationForm method in Employee class
    public String getVacationForm() {
        return "pink";
    }

    // additional methods here: extra vacation (15 days), pink form for vaca, they know how to sue
}
