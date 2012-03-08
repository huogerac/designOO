package br.com.bc.design.fibonacci;

public class Fibonacci {

	public long fibonacciDe(long n) {
		if (n <= 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}

		return fibonacciDe(n - 1) + fibonacciDe(n - 2);
	}
	
}
