package edu.brandeis.cosi12b2.lec14.precipitation;

public class Driver {
    public static void main(String[] args) {
        example1();
        // example2();
        // example3();
        // example4();
    }

    public static void example1() {
        System.out.println("Example 1");
        Snow var1 = new Sleet();
        var1.method2();
    }

    public static void example2() {
        System.out.println("Example 2");
        Snow var2 = new Rain();
        // var2.method1();
    }

    public static void example3() {
        System.out.println("Example 3");
        Snow var3 = new Rain();
        ((Sleet) var3).method3();
    }

    public static void example4() {
        System.out.println("Example 4");
        Fog var4 = new Fog();
        var4.method2();
    }
}
