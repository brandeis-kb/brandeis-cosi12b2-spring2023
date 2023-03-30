package edu.brandeis.cosi12b2.lec19.movie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Store {
	private List<AbstractMovie> allVideos = new ArrayList<>();
	private List<AbstractMovie> videosInStock = new ArrayList<>();
	private List<AbstractMovie> videosCheckedOut = new ArrayList<>();
	
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
	
	public Set<String> getTitles() {
		Set<String> titles = new HashSet<>();
		for (AbstractMovie m: videosInStock) {
			titles.add(m.getTitle());
		}
		return titles;
	}
	
	public AbstractMovie findVideo(String title) {
		for (int i=0; i< videosInStock.size(); i++) {
			AbstractMovie current = videosInStock.get(i);
			if (current.getTitle().equals(title)) {
				return current;
			}
		}
		return null;
	}

	public AbstractMovie findVideo(String title, int copy) {
		for (int i=0; i< videosInStock.size(); i++) {
			AbstractMovie current = videosInStock.get(i);
			if (current.getCopy() == copy && current.getTitle().equals(title)) {
				return current;
			}
		}
		return null;
	}

	public AbstractMovie findAndCheckOutVideo(String title, int copy) {
		AbstractMovie movie = findVideo(title, copy);
		return this.checkOutVideo(movie);
	}	

	public AbstractMovie checkOutVideo(AbstractMovie movie) {
		if (movie != null) {
			movie.setCheckedOut(true);
			videosInStock.remove(movie);
			videosCheckedOut.add(movie);
			return movie;
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
