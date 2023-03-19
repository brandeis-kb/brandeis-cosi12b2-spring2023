package edu.brandeis.cosi12b2.lec14.abstrct;

public class Apple extends Fruit {
	
	public Apple() {
		super("red", true);
	}
	
    public Apple(String color, boolean seasonal) {
    	super(color, seasonal);
    }

    public Apple(String color) {
    	super(color, true);
    }

    public Apple(int bushels, int size) {
    	super("green", true);
    }

    
    @Override
    public void prepare() {
    	System.out.println("Preparing my apple");
    	
    }

}
