package edu.brandeis.cosi12b2.lec12;


public class EmployeeMain {

    public static void main(String[] args) {

    	// can anyone think of a way to clean this up?
        Employee employee1 = new Employee(2);
        System.out.println("Employee: " + employee1);

        Secretary secretary = new Secretary();
        System.out.println("Secretary: " + secretary);
        secretary.takeDictation("CS12b example");

    }
}
