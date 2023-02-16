package edu.brandeis.cosi12b2.lec09;

public class PointMain5 {
    public static void main(String[] args){
        //Create two Point objects
        Point5 p1 = new Point5(5, 2);
        Point5 p2 = new Point5(4, 3);

//        double distance1 = distance(p1, p2);
//        System.out.printf("distance1 is [%s]\n", distance1);
//
//    
//        double distance2 = p1.distance(p2); 
//        System.out.printf("distance2 is [%s]\n", distance2);
//
//        double distance3 = p2.distance(p1); 
//        System.out.printf("distance3 is [%s]\n", distance3);
        
        Point5 p3 = new Point5(2, 1);
        Point5 p4 = new Point5(2, 1);
//        Point5 p5 = p3;
//        if (p3 == p5) {
//        	System.out.println("==");
//        } else {
//        	System.out.println("not ==");
//        }
        
        if (p3.equals(p4)) {
        	System.out.println("equals");
        } else {
        	System.out.println("not equals");        	
        }
    }
    
    public static double distance(Point5 p1, Point5 p2) {
    	double dx = p2.x - p1.x;
    	double dy = p2.y - p1.y;
    	return Math.sqrt(dx * dx + dy * dy);    	
    }
}
