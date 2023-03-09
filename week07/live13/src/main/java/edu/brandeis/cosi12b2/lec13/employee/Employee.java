package edu.brandeis.cosi12b2.lec13.employee;

public class Employee {
    protected int years;

    public Employee(int initialYears) {
        years = initialYears;
        System.out.println("Employee constructor called");
    }

    public int getHours() {
        return 40;
    }

    public double getSalary() {
        return 50000.0;
    }

    public int getVacationDays() {
        return 10 + getSeniorityBonus();
    }
    
    public int getSeniorityBonus() {
        return 2 * years;
    }    

    public String getVacationForm() {
        return "yellow";
    }
    
    @Override
    public String toString() {
        return String.format("Employee{hours=%d, salary='$%,.2f', vacationDays=%d, vacationForm='%s', years=%d}",
                getHours(),
                getSalary(),
                getVacationDays(),
                getVacationForm(),
                years
        );
    }
}
