package edu.brandeis.cosi12b2.lec08;

public class PointMain3 {
    public static void main(String[] args) {
        // testMethod01();
        testMethod02();
    }

    public static void testMethod01() {
        int i = 42;
        String s = "hello";
        // Point2 p = new Point2();
        Point3 p = new Point3();
        System.out.println("i is " + i);
        System.out.println("s is " + s);
        System.out.println("p is " + p);
    }

    public static void testMethod02() {
        // Create two Point objects
        Point3 p1 = new Point3();
        p1.x = 7;
        p1.y = 2;
        Point3 p2 = new Point3();
        p2.x = 4;
        p2.y = 3;
        // Translate p1
        p1.translate(11, 6);
        System.out.println("p1 is " + p1);
    }
}
