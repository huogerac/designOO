package br.com.bc.movie;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private String name;
	private List<Rental> rentals = new ArrayList<Rental>();

	public Customer(String name) {
		this.name = name;
	}

	public void addRental(Rental rental) {
		rentals.add(rental);
	}

	public String getName() {
		return name;
	}

	public String statement() {

		double totalAmount = 0;
		int frequentRenterPoints = 0;
		String result = "Rental Record for " + getName() + "\n";

		for (Rental rental : rentals) {
			double thisAmount = rental.getCharge();
			
			frequentRenterPoints += rental.getFrequentRenterPoints();
			
			// show figures for this rental
			result += "\t" + rental.getMovie().getTitle() + "\t"
					+ String.valueOf(thisAmount) + "\n";
			totalAmount += thisAmount;
		}
		
		// add footer lines
		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned " + String.valueOf(frequentRenterPoints)
				+ " frequent renter points";
		
		return result;
	}

}
