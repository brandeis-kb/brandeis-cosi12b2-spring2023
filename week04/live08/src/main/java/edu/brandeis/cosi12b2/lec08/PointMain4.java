package edu.brandeis.cosi12b2.lec08;

public class PointMain4 {
    public static void main(String[] args){
        //Create two Point objects
        Point4 p1 = new Point4(5, 2);
        Point4 p2 = new Point4(4, 3);
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
