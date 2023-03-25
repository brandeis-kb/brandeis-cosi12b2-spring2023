package edu.brandeis.cosi12b2.lec18.movie;

import java.util.ArrayList;
import java.util.List;

public class MovieDriver {
	
	public static void main(String[] args) {
		Store store = new Store();
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("Bob"));
		customers.add(new Customer("Ted"));
		customers.add(new Customer("Alice"));
		
		MovieSimulation movieSimulation = new MovieSimulation(store, customers);
		movieSimulation.run();
	}
	
	
}
