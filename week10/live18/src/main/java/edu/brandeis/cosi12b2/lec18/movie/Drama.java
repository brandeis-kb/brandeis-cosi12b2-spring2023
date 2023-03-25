package edu.brandeis.cosi12b2.lec18.movie;

public class Drama extends AbstractMovie {

	public Drama(String title, boolean checkedOut, int rentalTime, int copy) {
		super(title, checkedOut, rentalTime, copy);
	}

	@Override
	public String getGenre() {
		return "Drama";
	}
	
}
