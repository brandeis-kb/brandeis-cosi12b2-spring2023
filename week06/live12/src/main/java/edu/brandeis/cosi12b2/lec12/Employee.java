package edu.brandeis.cosi12b2.lec12;

public class Employee {
    private int years;

    public Employee(int initialYears) {
        years = initialYears;
    }

    public int getHours() {
        return 40;
    }

    public double getSalary() {
        return 50000.0;
    }

    public int getVacationDays() {
        return 10 + 2 * years;
    }

    public String getVacationForm() {
        return "yellow";
    }

    @Override
    public String toString() {
        return String.format("Employee{hours=%d, salary='$%,.2f', vacationDays=%d, vacationForm='%s'}",
                getHours(),
                getSalary(),
                getVacationDays(),
                getVacationForm()
        );
    }
}
