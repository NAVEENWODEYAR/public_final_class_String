/**
 * @author Naveen K Wodeyar
 * @date 13-Dec-2024
 */
package com.string.code;

/**
 * 
 */
public class PrimeNumbers {
	    public static void main(String[] args) {
	        int limit = 100; // You can set any limit here
	        System.out.println("Prime numbers up to " + limit + ":");
	        
	        for (int num = 2; num <= limit; num++) {
	            if (isPrime(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false;
	            }
	        }
	        return true;
	    }
	
}
