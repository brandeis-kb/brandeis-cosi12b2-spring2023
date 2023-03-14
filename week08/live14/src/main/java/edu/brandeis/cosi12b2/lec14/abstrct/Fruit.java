package edu.brandeis.cosi12b2.lec14.abstrct;

public abstract class Fruit {
    private String color;
    private boolean seasonal;

    protected Fruit(String color, boolean seasonal) {
        this.color = color;
        this.seasonal = seasonal;
    }

    public abstract void prepare();

    public String getColor() {
        return color;
    }

    public boolean isSeasonal() {
        return seasonal;
    }
}
