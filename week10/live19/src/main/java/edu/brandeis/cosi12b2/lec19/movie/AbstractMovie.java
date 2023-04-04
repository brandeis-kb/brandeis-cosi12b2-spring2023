package edu.brandeis.cosi12b2.lec19.movie;

/**
 *
 * @author kbrumer
 *
 */
public abstract class AbstractMovie {
	private final String title;
	private boolean checkedOut = false;
	private int rentalTime = 0;
	private final int copy;	
	
	private int lateFee;
	
	public AbstractMovie(String title, boolean checkedOut, int rentalTime, int copy) {
		this.title = title;
		this.checkedOut = checkedOut;
		this.rentalTime = rentalTime;
		this.copy = copy;
		this.lateFee = 0;
	}
	
	public abstract String getGenre();
	
	@Override
	public String toString() {
		return String.format("{title=\"%s\", checkedOut=%s, rentalTime=%d, copy=%d, genre=%s, lateFee=%d}\n",
				title, checkedOut, rentalTime, copy, getGenre(), lateFee);
	}
	
	public int getCopy() {
		return copy;
	}
	
	public int getRentalTime() {
		return rentalTime;
	}
	
	public boolean isCheckedOut() {
		return checkedOut;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setCheckedOut(boolean checkedOut) {
		this.checkedOut = checkedOut;
	}
	
	public void setRentalTime(int rentalTime) {
		this.rentalTime = rentalTime;
	}
	
	public int getLateFee() {
		return lateFee;
	}
	
	public void setLateFee(int lateFee) {
		this.lateFee = lateFee;
	}
}
