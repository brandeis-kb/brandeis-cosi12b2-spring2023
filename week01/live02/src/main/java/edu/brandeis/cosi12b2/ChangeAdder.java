package edu.brandeis.cosi12b2;

public class ChangeAdder {
    public static void main(String[] args) {
        int quarters = 10;
        int dimes = 3;
        int nickels = 7;
        int pennies = 6;
        int change = 0;
        change = 25 * quarters + 10 * dimes + 5 * nickels + pennies;
        System.out.println("total in change is:" + change);
    }
}