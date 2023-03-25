package edu.brandeis.cosi12b2.lec18.movie;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Customer {
	private String name;
	private int lateFees;
	
	public Customer(String name) {
		this.name = name;
	}

	List<AbstractMovie> videosAtHome = new ArrayList<>();
	
	public void rent(Store store) {
		List<String> videoTitles = new ArrayList<>(store.getTitles());
		List<String> videosAtHome = getTitlesAtHome();
		
		videoTitles.removeAll(videosAtHome);
		
		if (videoTitles.size() > 0) {
			String title = videoTitles.get(0);
			AbstractMovie movie = store.findVideo(title);
			store.checkOutVideo(movie);
			this.videosAtHome.add(movie);
		}
	}

	public void returnVideo(Store store) {
		if (videosAtHome.size() > 0) {
			AbstractMovie movie = videosAtHome.get(0);	
			store.checkInVideo(movie);
			this.videosAtHome.remove(movie);
		}
	}
	
	private List<String> getTitlesAtHome() {
		List<String> titles = new ArrayList<>();
		for (AbstractMovie m: videosAtHome) {
			titles.add(m.getTitle());
		}
		return titles;
	}
	
	@Override
	public String toString() {
		return String.format("{name=%s, lateFees=%d, rentals=%d", name, lateFees, videosAtHome.size());
	}

}
