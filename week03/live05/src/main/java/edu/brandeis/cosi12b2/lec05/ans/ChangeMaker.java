package edu.brandeis.cosi12b2.lec05.ans;

import java.util.Scanner;

public class ChangeMaker {

    // 1.
    // Given an amount (as a float) from 0.00 - 1.99, make change -
    // tell me how many quarters, dimes, nickels and pennies
    // to equal that amount

    public static void main(String[] args) {
        // 2. examples
        // 1.01 = 4 quarters, 1 penny (1.00 + .01)
        // 0.37 = 1 quarter, 1 dime, 2 pennies (.25 + .10 + .02)
        // 0.99 = 3 quarters, 2 dimes, 4 pennies (.75 + .20 + .04)

        // 3. approach
        // we could use division and modules, but for sake of example let's
        // add constraint that we can only use the + and - operator

        // (a) find number of quarters
        // (b) -------------- dimes
        // (c) -------------- nickels
        // (d) -------------- pennies

        // 4. thoughts/ caveats ?
        // (a) sanitize inputs
        // (b) deal in whole cents/ integers
        // (c) write each as method
        // (d) take user input - however write test methods
        // (e) write method to pluralize (quarter/quarters, penny/pennies)

        // 5. let's write some code !!
        System.out.println("Starting!");

        liveInput();
        // testMethod();

        System.out.println("Finished");
    }

    public static String makeChange(float input) {
        int inputInCents = (int) (input * 100);
        int quarters = countCoin(inputInCents, 25);
        int remainder1 = findRemainder(inputInCents, 25);
        // System.out.printf("There are [%d] quarters in [%d] with remainder [%d]\n", quarters, inputInCents, remainder1);

        int dimes = countCoin(remainder1, 10);
        int remainder2 = findRemainder(remainder1, 10);
        // System.out.printf("There are [%d] dimes in [%d] with remainder [%d]\n", dimes, remainder1, remainder2);

        int nickels = countCoin(remainder2, 25);
        int pennies = findRemainder(remainder2, 25);
        // System.out.printf("There are [%d] nickels in [%d] with pennies [%d]\n", nickels, remainder2, pennies);

        String message = format("quarter", "quarters", quarters) +
                format("dime", "dimes", dimes) +
                format("nickel", "nickels", nickels) +
                format("penny", "pennies", pennies);
        return message;
    }

    public static String format(String singular, String plural, int amount) {
        String commaSpace = "";
        if (!singular.equals("penny")) {
            commaSpace = ", ";
        }
        if (amount > 1) {
            return String.format("%d %s%s", amount, plural, commaSpace);
        } else if (amount > 0) {
            return String.format("%d %s%s", amount, singular, commaSpace);
        } else {
            return "";
        }
    }

    public static int countCoin(int inputInCents, int coinAmount) {
        int i = 0;
        while (inputInCents > coinAmount) {
            inputInCents = inputInCents - coinAmount;
            i++;
        }
        return i;
    }


    public static int findRemainder(int inputInCents, int coinAmount) {
        while (inputInCents > coinAmount) {
            inputInCents = inputInCents - coinAmount;
        }
        return inputInCents;
    }


    public static void testMethod() {
        String rv1 = makeChange(1.01f);
        assertTrue(rv1, "4 quarters, 1 penny");

        String rv2 = makeChange(0.37f);
        assertTrue(rv2, "1 quarter, 1 dime, 2 pennies");

        String rv3 = makeChange(0.99f);
        assertTrue(rv3, "3 quarters, 2 dimes, 4 pennies");
    }

    public static void liveInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an amount between 0.01 and 1.99: ");
        float amount = scanner.nextFloat();
        String message = makeChange(amount);
        System.out.println(message);
    }

    public static void assertTrue(String lhs, String rhs) {
        if (lhs.equals(rhs)) {
            System.out.println("Ok");
        } else {
            System.out.printf("[%s] does not equals [%s]\n", lhs, rhs);
        }

    }

}
