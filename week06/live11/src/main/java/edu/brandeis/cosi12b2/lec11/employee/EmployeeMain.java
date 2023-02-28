package edu.brandeis.cosi12b2.lec11.employee;


public class EmployeeMain {

    public static void main(String[] args) {
        System.out.println("Employee:");

        // can anyone think of a way to clean this up?
        Employee employee1 = new Employee();
        System.out.print(employee1.getHours() + ", ");
        System.out.printf("$%.2f, ", employee1.getSalary());
        System.out.print(employee1.getVacationDays() + ", ");
        System.out.println(employee1.getVacationForm());

        System.out.print("Secretary: ");

        Secretary employee2 = new Secretary();
        System.out.print(employee2.getHours() + ", ");
        System.out.printf("$%.2f, ", employee2.getSalary());
        System.out.print(employee2.getVacationDays() + ", ");
        System.out.println(employee2.getVacationForm());
        employee2.takeDictation("CS12b example");

    }
}
