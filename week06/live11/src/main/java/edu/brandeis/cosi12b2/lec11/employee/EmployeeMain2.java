package edu.brandeis.cosi12b2.lec11.employee;


public class EmployeeMain2 {
    public static void main(String[] args) {
        System.out.println("Lawyer:");

        Lawyer lawyer = new Lawyer();
        System.out.println("Lawyer:" + lawyer);

        lawyer.sue();

//        System.out.print("Legal Secretary: ");
//        LegalSecretary employee4 = new LegalSecretary();
//        System.out.print(employee4.getHours() + ", ");
//        System.out.printf("$%.2f, ", employee4.getSalary());
//        System.out.print(employee4.getVacationDays() + ", ");
//        System.out.println(employee4.getVacationForm());
//        employee4.takeDictation("CS12b example");
//
//        employee4.fileLegalBriefs();
    }
}
