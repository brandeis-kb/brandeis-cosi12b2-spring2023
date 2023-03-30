package edu.brandeis.cosi12b2.lec19.movie;

public class Drama extends AbstractMovie {

	public Drama(String title, boolean checkedOut, int rentalTime, int copy) {
		super(title, checkedOut, rentalTime, copy);
	}

	@Override
	public String getGenre() {
		return "Drama";
	}
	
}
