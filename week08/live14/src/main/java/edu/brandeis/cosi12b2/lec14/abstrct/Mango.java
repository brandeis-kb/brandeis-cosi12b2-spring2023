package edu.brandeis.cosi12b2.lec14.abstrct;

public class Mango extends Fruit {
    public Mango(String color, boolean seasonal) {
        super(color, seasonal);
    }

    @Override
    public void prepare() {
        System.out.println("Cut the Mango");
    }
}
