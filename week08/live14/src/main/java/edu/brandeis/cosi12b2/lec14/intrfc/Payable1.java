package edu.brandeis.cosi12b2.lec14.intrfc;

public interface Payable1 {
    public abstract double calcSalary();
    public abstract boolean salaried();
    public static final double DEDUCTIONS = 25.5;
}

