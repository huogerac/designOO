package br.com.bc.movie;

import static org.junit.Assert.*;

import org.junit.Test;

public class MovieTest {

	@Test
	public void statementTest() {

		Movie marvel1 = new Movie("Iron Man", Movie.REGULAR);
		Movie marvel2 = new Movie("X-Men Origins: Wolverine", Movie.REGULAR);
		Movie marvel3 = new Movie("Iron Man 2", Movie.NEW_RELEASE);

		Rental rental1 = new Rental(marvel1, 4);
		Rental rental2 = new Rental(marvel2, 4);
		Rental rental3 = new Rental(marvel3, 4);

		Customer customer1 = new Customer("Roger");
		customer1.addRental(rental1);
		customer1.addRental(rental2);
		customer1.addRental(rental3);

		String statement = customer1.statement();

		assertEquals("Rental Record for Roger\n" +
		             "	Iron Man	5.0\n" +
				     "	X-Men Origins: Wolverine	5.0\n" + 
		             "	Iron Man 2	12.0\n" + 
				     "Amount owed is 22.0\n" +
				     "You earned 4 frequent renter points", statement);

	}
	
	@Test
	public void statementHtmlTest() {

		Movie marvel1 = new Movie("Iron Man", Movie.REGULAR);
		Movie marvel2 = new Movie("X-Men Origins: Wolverine", Movie.REGULAR);
		Movie marvel3 = new Movie("Iron Man 2", Movie.NEW_RELEASE);

		Rental rental1 = new Rental(marvel1, 4);
		Rental rental2 = new Rental(marvel2, 4);
		Rental rental3 = new Rental(marvel3, 4);

		Customer customer1 = new Customer("Roger");
		customer1.addRental(rental1);
		customer1.addRental(rental2);
		customer1.addRental(rental3);

		String statement = customer1.htmlStatement();
		
		assertEquals("<H1>Rentals for <EM>Roger</EM></H1><P>\n" +
		             "Iron Man: 5.0<BR>\n" +
				     "X-Men Origins: Wolverine: 5.0<BR>\n" + 
		             "Iron Man 2: 12.0<BR>\n" + 
				     "<P>You owe <EM>22.0</EM><P>\n" +
				     "On this rental you earned <EM>4</EM> frequent renter points<P>", statement);

	}	

}
