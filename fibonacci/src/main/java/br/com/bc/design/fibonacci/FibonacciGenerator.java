package br.com.bc.design.fibonacci;

import java.util.Iterator;

public class FibonacciGenerator implements Iterator<Long>  {

	boolean firstBaseCaseInvoked;
	boolean secondBaseCaseInvoked;
	Long prePrevious;
	Long previous;
	Long current;

	public FibonacciGenerator() {
		firstBaseCaseInvoked = false;
		secondBaseCaseInvoked = false;
	}

	public boolean hasNext() {
		return true;
	}

	public Long next() {
		if (!firstBaseCaseInvoked) {
			firstBaseCaseInvoked = true;
			return 0L;
		}

		if (!secondBaseCaseInvoked) {
			secondBaseCaseInvoked = true;
			prePrevious = 0L;
			previous = 1L;
			current = 1L;
			return 1L;
		}
		
		Long ret = current;
		prePrevious = previous;
		previous = current;
		current = prePrevious + previous;
		return ret;
	}

	public void remove() {
		throw new UnsupportedOperationException("Sorry! you can't remove.");
	}
}
