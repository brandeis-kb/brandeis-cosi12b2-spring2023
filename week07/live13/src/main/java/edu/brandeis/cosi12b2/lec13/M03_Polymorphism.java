package edu.brandeis.cosi12b2.lec13;

import edu.brandeis.cosi12b2.lec13.employee.Employee;
import edu.brandeis.cosi12b2.lec13.employee.Lawyer;
import edu.brandeis.cosi12b2.lec13.employee.Secretary;


public class M03_Polymorphism {

    public static void main(String[] args) {
        Lawyer law = new Lawyer(2);
        Secretary sec = new Secretary(3);
        printInfo(law);
        printInfo(sec);
    }
    public static void printInfo(Employee empl){
        System.out.println(empl);
    }
}
