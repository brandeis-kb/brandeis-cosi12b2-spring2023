package edu.brandeis.cosi12b2.lec08;

public class PointMain1 {
    public static void main(String[] args) {
        // create two Point objects
        Point1 p1 = new Point1();
        p1.y = 2;
        Point1 p2 = new Point1();
        p2.x = 4;
// print p1
        System.out.println(p1.x + "," + p1.y);
// move p2 and then print it
        p2.x += 2;
        p2.y++;
        System.out.println(p2.x + "," + p2.y);
    }
}
