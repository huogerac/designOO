package br.com.bc.movie;

public class Rental {
	
	private Movie movie;
	private int daysRented;
	
	public Rental(Movie movie, int daysRented) {
		this.movie = movie;
		this.daysRented = daysRented;
	}
	
	public int getDaysRented() {
		return this.daysRented;
	}
	
	public Movie getMovie() {
		return movie;
	}
		
	
	public double getCharge() {
		return movie.getCharge(daysRented);	
	}

	public int getFrequentRenterPoints() {
		return movie.getFrequentRenterPoints(daysRented);
	}
}
