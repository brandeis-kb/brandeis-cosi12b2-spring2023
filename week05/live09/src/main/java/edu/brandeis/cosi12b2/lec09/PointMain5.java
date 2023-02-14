package edu.brandeis.cosi12b2.lec09;

public class PointMain5 {
    public static void main(String[] args){
        //Create two Point objects
        Point5 p1 = new Point5(5, 2);
        Point5 p2 = new Point5(4, 3);

        //Print each point
        System.out.println("p1 is "+ p1);
        System.out.println("p2 is "+ p2);
        //Translate each point to a new location
        p1.translate(11, 6);
        p2.translate(1, 7);
        //Print the points again
        System.out.println("p1 is "+ p1);
        System.out.println("p2 is "+ p2);
    }
}
