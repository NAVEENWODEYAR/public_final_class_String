package com.string.code;

import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 13-Dec-2024
 * PrimeNumbers program to print prime numbers up to a specified limit.
 */

public class PrimeNumbers {
    public static void main(String[] args) {
        int limit = 100; // You can set any limit here
        System.out.println("Prime numbers up to " + limit + ":");

        // Iterate through numbers from 2 to limit and print the prime numbers
        for (int num = 2; num <= limit; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
        
        // Generate first 50 prime numbers
        IntStream.iterate(2, i -> i + 1)
                 .filter(PrimeNumbers::isPrime)
                 .limit(50)
                 .forEach(System.out::println);
    }

    /**
     * Checks if a number is prime.
     * 
     * @param num The number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        // Check divisibility up to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // If divisible by any number, it's not prime
            }
        }
        return true; // If no divisors found, it's prime
    }
    
    // Method to check if a number is prime
    public static boolean isPrimeStream(int number) {
        if (number < 2) 
        	return false;
        return IntStream.rangeClosed(2, (int)Math.sqrt(number))
                        .allMatch(n -> number % n != 0);
    }
}
