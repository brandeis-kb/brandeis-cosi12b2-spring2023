package edu.brandeis.cosi12b2.lec14.abstrct;

public class Banana extends Fruit {
    public Banana(String color, boolean seasonal) {
        super(color, seasonal);
    }

    @Override
    public void prepare() {
        System.out.println("Peel the Banana");
    }
}
