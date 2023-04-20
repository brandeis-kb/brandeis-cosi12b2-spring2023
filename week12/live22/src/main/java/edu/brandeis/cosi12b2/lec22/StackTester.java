package edu.brandeis.cosi12b2.lec22;

public class StackTester {

    public static void main(String[] args) {
        System.out.println("========== Begin Test Push ==========");
        testPush();
        System.out.println("==========  End Test Push  ==========");
        System.out.println("========== Begin Test Pop  ==========");
        testPop();
        System.out.println("==========  End Test Pop   ==========");
    }

    public static void testPush() {
        Stack<String> stack = new Stack<>(4);
        System.out.println(stack);

        System.out.println("=== Add Two");
        stack.push("Cow");
        stack.push("Chicken");
        System.out.println(stack);

        System.out.println("=== Add Two More");
        stack.push("Goat");
        stack.push("Pig");
        System.out.println(stack);

        System.out.println("=== Add One More");
        stack.push("Duck");
    }

    public static void testPop() {
        Stack<String> stack = new Stack<>(4);
        System.out.println(stack);

        System.out.println("=== Add Two");
        stack.push("Cow");
        stack.push("Chicken");
        System.out.println(stack);

        System.out.println("=== Pop Two");
        String animal1 = stack.pop();
        System.out.printf("Animal 1 is [%s]\n", animal1);
        String animal2 = stack.pop();
        System.out.printf("Animal 2 is [%s]\n", animal2);
        System.out.println(stack);

        System.out.println("=== Pop One More");
        stack.pop();
    }
}
