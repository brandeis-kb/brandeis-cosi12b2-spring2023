package edu.brandeis.cosi12b2.lec08;

public class Point3 {
    int x;
    int y;

    // shifts this point;s location by the given amount
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }

    // toString method
    public String toString(){
        return "(" + x + ", " + y + ")";
    }

}
