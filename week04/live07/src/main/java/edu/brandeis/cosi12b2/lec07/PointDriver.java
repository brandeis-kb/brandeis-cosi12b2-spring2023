package edu.brandeis.cosi12b2.lec07;

public class PointDriver {
    public static void main(String[] args) {
        Point p1 = new Point();
        Point p2 = new Point();

        System.out.println("the x-coord is " + p1.x);
        p1.x = 7;
        p1.y = 13;

        System.out.println("the x-coord is " + p1.x);
    }
}
