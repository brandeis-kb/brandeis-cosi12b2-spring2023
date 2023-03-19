package edu.brandeis.cosi12b2.lec15.gnrcs;

import java.util.*;

public class Driver {

	public static void main (String[ ] args){
        pointDriver();
        boxDriver();
    }
    
    public static void pointDriver() {
        PointBox pb1 = new PointBox();
        pb1.put(new Point(3,2));
        System.out.println(pb1.get().getY());
    }

    public static void objectDriver() {
        ObjectBox pb1 = new ObjectBox();
        pb1.put(new Point(3,2));
        System.out.println(((Point)pb1.getObject()).getY());
    }

    public static void boxDriver() {
        Point p2 = new Point(0,5);
        System.out.println("Making a box for points:");
        Box<Point> b1 = new Box<Point>( );
        b1.put(p2);
        System.out.println(b1.get().getY());
    }
}
