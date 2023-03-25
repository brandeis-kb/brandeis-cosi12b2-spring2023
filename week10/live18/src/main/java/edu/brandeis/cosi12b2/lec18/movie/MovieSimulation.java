package edu.brandeis.cosi12b2.lec18.movie;

import java.util.List;
import java.util.Random;

public class MovieSimulation {
	private Store store;
	private List<Customer> customers;
	private Random random; 
	
	public MovieSimulation(Store store, List<Customer> customers) {
		this.store = store;
		this.customers = customers;
		this.random = new Random();
	}

	public void run() {
//		store.printInventory();
//		
//		AbstractMovie video1 = store.findAndCheckOutVideo("Star Wars Episode IV: A New Hope", 1);
//		System.out.println("video1 is " + video1);
//		video1.setCheckedOut(true);
//		System.out.println("video1 is after checkout " + video1);
//		
//		store.printInventory();
		// model 
		for (int i = 0; i < 7; i++) {
			runDay(i);	
		}
	}
	
	public void runDay(int day) {
		System.out.printf("Runing simulation on day [%d]\n", day);
		
		// iterate over customers
		for (int i=0; i < customers.size(); i++) {
			Customer customer = customers.get(i);
			if (random.nextFloat() < 0.80) { 
				System.out.printf("Customer [%s] comes in\n", customer);
				if (random.nextFloat() < 0.50) {
					customer.rent(store);
				}
				if (random.nextFloat() < 0.90) {
					customer.returnVideo(store);
				}
			}
			System.out.printf("Customer [%s]\n", customer);
		}
		// assess late fees
	}
	
	public void rentVideo(Customer customer) {
		
	}
	


}
