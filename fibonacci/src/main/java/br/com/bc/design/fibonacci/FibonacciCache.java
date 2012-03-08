package br.com.bc.design.fibonacci;

import java.util.HashMap;
import java.util.Map;


public class FibonacciCache {

	private Map<Long, Long> cache;

	public FibonacciCache() {
		cache = new HashMap<Long, Long>();
	}

	public Long fibonacci(Long n) {

		if (n <= 0) {
			return 0L;
		}
		
		if ( cache.containsKey(n) ) {
			return cache.get(n);
		}

		Long result = fibonacci(n - 1) + fibonacci(n - 2);
		cache.put(n, result);
		
		return result;
	}
}
