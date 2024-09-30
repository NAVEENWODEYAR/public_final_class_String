package com.string.series;
/**
 * @author Naveen K Wodeyar
 * @date 30-Sept-2024
 */
import java.util.*;

public class PrimeNumbers {

	public List<Integer> generatePrimes(int n) {
	    List<Integer> primes = new ArrayList<>();
	    for (int num = 2; num <= n; num++) {
	        if (isPrime(num)) {
	            primes.add(num);
	        }
	    }
	    return primes;
	}

	private boolean isPrime(int num) {
	    if (num < 2) return false;
	    for (int i = 2; i <= Math.sqrt(num); i++) {
	        if (num % i == 0) return false;
	    }
	    return true;
	}

	public static void main(String[] args) {
		
	}

}
