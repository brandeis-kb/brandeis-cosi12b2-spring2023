package edu.brandeis.cosi12b2.lec14.abstrct;

public abstract class Shape {

    public void display(){
        System.out.println("This is a display method" + calculateArea());
    }

    public abstract double calculateArea();
    
    public static void main(String[] args) {
    	// Shape s = new Shape();
    }
}
