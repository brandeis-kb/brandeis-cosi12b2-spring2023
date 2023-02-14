package edu.brandeis.cosi12b2.lec08;

public class Point2 {
    static int x1;
    static int y1;
    
    int x0;
    int y0;

    // shifts this point;s location by the given amount
    public static void translate(int dx, int dy){
       x1 += dx;
       y1 += dy;
    }
    
    public void translate0(int dx, int dy){
        x0 += dx;
        y0 += dy;
     }

    public static void main(String args[]) {
    	Point2.x1 = 7;
    	Point2.y1 = 4;
    	
        //System.out.println("p1 is (" + Point2.x1 + "," + Point2.y1 + ")");
        translate(1, 2);

        //System.out.println("p1 is (" + Point2.x1 + "," + Point2.y1 + ")");
        
        
        Point2 p2 = new Point2();
        System.out.println("p2 static is (" + p2.x1 + "," + p2.y1 + ")");
        
        p2.x0 = 3;
        p2.y0 = 6;
        System.out.println("p2 instance is (" + p2.x0 + "," + p2.y0 + ")");
        
        Point2 p3 = new Point2();
        System.out.println("p3 static is (" + p3.x1 + "," + p3.y1 + ")");
        
        p3.x0 = 14;
        p3.y0 = 22;
        System.out.println("p3 instance is (" + p3.x0 + "," + p3.y0 + ")");
        
        
    }
}
