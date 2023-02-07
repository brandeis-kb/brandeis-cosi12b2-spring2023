package edu.brandeis.cosi12b2.lec08;

public class Point4 {
    int x;
    int y;

    public Point4(int x, int y) {
        this.x = x; // this.x refers to value on line 4, x on line 7
        this.y = y;
    }

//    public Point4(int x0, int y0) {
//        this.x = x0;
//        this.y = y0;
//    }

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
