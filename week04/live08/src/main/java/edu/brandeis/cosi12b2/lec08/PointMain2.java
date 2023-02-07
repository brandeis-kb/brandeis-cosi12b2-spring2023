package edu.brandeis.cosi12b2.lec08;

public class PointMain2 {
    public static void main(String[] args) {
        // create two Point objects
        Point1 p1 = new Point1();
        p1.x = 7;
        p1.y = 2;
        Point1 p2 = new Point1();
        p2.x = 4;
        p2.y = 3;
        // print the points
        System.out.println("p1 is (" + p1.x + "," + p1.y + ")");
        System.out.println("p2 is (" + p2.x + "," + p2.y + ")");
        // translate each point to a new location
        p1.x += 11;
        p1.y += 6;
        p2.x += 1;
        p2.y += 7;
        // print the points
        System.out.println("p1 is (" + p1.x + "," + p1.y + ")");
        System.out.println("p2 is (" + p2.x + "," + p2.y + ")");
    }

    // static method to translate a Point
    public static void translate(Point1 p, int dx, int dy) {
        p.x += dx;
        p.y += dy;
    }
}
