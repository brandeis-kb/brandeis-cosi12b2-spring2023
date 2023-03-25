package edu.brandeis.cosi12b2.lec17.movie;

import java.util.ArrayList;
import java.util.List;

public class Store {
	List<AbstractMovie> allVideos = new ArrayList<>();
	List<AbstractMovie> videosInStock = new ArrayList<>();
	List<AbstractMovie> videosCheckedOut = new ArrayList<>();
	
	public Store() {
		allVideos.add(new Action("The Matrix", false, 0, 1));
		allVideos.add(new Drama("Godfather II", false, 0, 1));
		allVideos.add(new Drama("Godfather II", false, 0, 2));
		allVideos.add(new Action("Star Wars Episode IV: A New Hope", false, 0, 1));
		allVideos.add(new Action("Star Wars Episode IV: A New Hope", false, 0, 2));
		allVideos.add(new Action("Star Wars Episode IV: A New Hope", false, 0, 3));
		allVideos.add(new Action("Star Wars Episode IV: A New Hope", false, 0, 4));
		allVideos.add(new Family("Wallace & Gromit: A Close Shave", false, 0, 1));
		allVideos.add(new Family("Wallace & Gromit: A Close Shave", false, 0, 2));
		
		videosInStock.addAll(allVideos);
	}
	
	public AbstractMovie checkOutVideo(String title, int copy) {
		for (int i=0; i< videosInStock.size(); i++) {
			AbstractMovie current = videosInStock.get(i);
			if (current.getCopy() == copy && current.getTitle().equals(title)) {
				current.setCheckedOut(true);
				videosInStock.remove(current);
				videosCheckedOut.add(current);
				return current;
			}
		}
		return null;
	}
	

	public void checkInVideo(AbstractMovie movie) {
		movie.setCheckedOut(false);
		videosCheckedOut.remove(movie);
		videosInStock.add(movie);
	}

	
	public void printInventory() {
		System.out.println("In Stock =" + videosInStock);
		System.out.println("Checked Out =" + videosCheckedOut);
	}


}
