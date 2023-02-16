package edu.brandeis.cosi12b2.lec09;

public class Point5 {
    int x;
    int y;

//    public Point5(int x, int y) {
//        this.x = x; // this.x refers to value on line 4, x on line 7
//        this.y = y;
//    }

    public Point5() {
        x = 0;
        y = 0;
    }

    public Point5(int _x, int _y) {
        x = _x;
        y = _y;
    }

    public Point5(Point5 p){
        //this.x = p.x;
        //this.y = p.y;
    	this(p.x, p.y);
    }
    
    public int getX() {
    	return x;
    }
    
    public void setX(int x1) {
    	x = x1;
    }

    // shifts this point;s location by the given amount
    public void translate(int dx, int dy) {
        x += dx;
        y += dy;
        // setLocation(x + dx, y + dy);
    }

    public void setLocation(int newX, int newY) {
        x = newX;
        y = newY;
    }

    public double distance(Point5 p2) {
        int dx = x - p2.x;
        int dy = y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public double distanceFromOrigin(){
    	Point5 origin = new Point5(0, 0);
    	return distance(origin);
    }
    
    
    public double distanceFromOrigin1(){
        return Math.sqrt(x * x + y * y);
    }

    // toString method
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Object o) {
        if (o instanceof Point5) {
            Point5 p = (Point5) o;
            return x == p.x && y == p.y;
        } else {
            return false;
        }
    }

}
