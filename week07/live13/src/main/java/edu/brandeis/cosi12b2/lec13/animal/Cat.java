package edu.brandeis.cosi12b2.lec13.animal;

public class Cat extends Mammal {
	
	public void speak() {
		System.out.println("meow");
	}
	
	public String owner() {
		return "Bob";
	}

}
