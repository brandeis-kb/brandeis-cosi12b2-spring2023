package edu.brandeis.cosi12b2.lec11.employee;

public class Employee {

    public int getHours() {
        // works 40 hours/week
        return 40;
    }

    public double getSalary() {
        // $40,000.00/year
        return 40000.0;
    }

    public int getVacationDays() {
        // 2 weeks' paid vacation
        return 10;
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