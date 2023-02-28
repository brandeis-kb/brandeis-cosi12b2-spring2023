package edu.brandeis.cosi12b2.lec11.employee;


public class EmployeeMain2 {
    public static void main(String[] args) {
        System.out.println("Lawyer:");

        Lawyer employee3 = new Lawyer();
        System.out.print(employee3.getHours() + ", ");
        System.out.printf("$%.2f, ", employee3.getSalary());
        System.out.print(employee3.getVacationDays() + ", ");
        System.out.println(employee3.getVacationForm());

        System.out.println("Lawyer.toString():");
        System.out.println(employee3);

        // employee3.sue();

        System.out.print("Legal Secretary: ");
        LegalSecretary employee4 = new LegalSecretary();
        System.out.print(employee4.getHours() + ", ");
        System.out.printf("$%.2f, ", employee4.getSalary());
        System.out.print(employee4.getVacationDays() + ", ");
        System.out.println(employee4.getVacationForm());
        employee4.takeDictation("CS12b example");

        employee4.fileLegalBriefs();
    }
}
