package br.com.bc.design.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void fibonacciSequence() {
		
		Fibonacci fib = new Fibonacci();
		
		assertEquals( 0, fib.fibonacciDe(0) );
		assertEquals( 1, fib.fibonacciDe(1) );
		assertEquals( 1, fib.fibonacciDe(2) );
		assertEquals( 2, fib.fibonacciDe(3) );
		assertEquals( 3, fib.fibonacciDe(4) );
		assertEquals( 5, fib.fibonacciDe(5) );
		assertEquals( 34, fib.fibonacciDe(9) );
		//assertEquals( 34, fib.fibonacciDe(47) );
		
	}
	
	@Test
	public void fibonacciSameSequence() {
		
		long t0 = System.currentTimeMillis();
		
		Fibonacci fib = new Fibonacci();
		
		for (int i=0; i < 60; i++) {
			fib.fibonacciDe(30);
		}
		
		long t1 = System.currentTimeMillis() - t0;
		
		System.out.println(t1);
		
		
	}
	
	@Test
	public void fibonacciCacheSameSequence() {
		
		long t0 = System.currentTimeMillis();
		
		FibonacciCache fib = new FibonacciCache();
		
		for (long i=0; i < 60; i++) {
			fib.fibonacci(30L);
		}
		
		long t1 = System.currentTimeMillis() - t0;
		
		System.out.println(t1);
		
		
	}	
	
	//@Test
	public void fibonacciGen() {
		FibonacciGenerator generator = new FibonacciGenerator();
    	Long f; 
        while (generator.hasNext() &&  (f = generator.next()) < 8000000000000000000L) {
            System.out.println(f);
        }
	}

}
