package edu.brandeis.cosi12b2.lec10;

/**
 * Point class
 * 
 * @author kbrumer
 *
 */
public class Point {
	private int x;
	private int y;
	
	// constructor
	public Point(int x, int y) {
		// if 
		this.x = x;
		this.y = y;
	}
	
	// no arg constructor
	public Point() {
		this(0, 0);
	}
	
    // shifts this point;s location by the given amount
    public void translate(int dx, int dy) {
    	// protect as well
        x += dx;
        y += dy;
    }

    // distance from given point
    public double distance(Point p2) {
    	// 
        int dx = x - p2.x;
        int dy = y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // distnce from origin
    public double distanceFromOrigin(){
    	Point origin = new Point();
    	return distance(origin);
    }

    // override toString with something useful
    public String toString() {
    	return String.format("(%d, %d)", x, y);
    }
    
    // Returns whether o refers to a Point object with 
    // the same (x, y) coordinates as this Point object 
    public boolean equals(Object o) {
    	if (o instanceof Point) {
    		Point other = (Point) o;
			return x == other.x && y == other.y;
        } else {
          return false;
        }
    }

    // add getters and setters appropriately
    public int getX() {
		return x;
	}
    public int getY() {
		return y;
	}
}
