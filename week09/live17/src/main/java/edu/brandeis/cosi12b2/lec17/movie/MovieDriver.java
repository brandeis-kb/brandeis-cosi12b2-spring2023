package edu.brandeis.cosi12b2.lec17.movie;

public class MovieDriver {
	
	public static void main(String[] args) {
		Store store = new Store();
		store.printInventory();
		
		AbstractMovie video1 = store.checkOutVideo("Star Wars Episode IV: A New Hope", 1);
		System.out.println("video1 is " + video1);
		video1.setCheckedOut(true);
		System.out.println("video1 is after checkout " + video1);
		
		store.printInventory();

	}

}
