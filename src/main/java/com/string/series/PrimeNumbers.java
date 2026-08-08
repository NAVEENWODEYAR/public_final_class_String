package com.string.series;

import java.util.*;

/**
 * Generate Prime Numbers up to N.
 *
 * @author Naveen K Wodeyar
 * @date 30-Sept-2024
 */
public class PrimeNumbers {

    /**
     * Returns all prime numbers from 2 to n (inclusive).
     *
     * @param n upper limit
     * @return list of prime numbers
     */
    public List<Integer> generatePrimes(int n) {
        List<Integer> primes = new ArrayList<>();

        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                primes.add(num);
            }
        }

        return primes;
    }

    /**
     * Checks whether a number is prime.
     *
     * @param num number to check
     * @return true if prime, otherwise false
     */
    private boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }

    // ---------------------------------------------------------
    // LeetCode-style test cases
    // ---------------------------------------------------------

    private static void testGeneratePrimes(
            PrimeNumbers solution,
            int n,
            List<Integer> expected) {

        List<Integer> actual = solution.generatePrimes(n);

        if (!actual.equals(expected)) {
            throw new AssertionError(
                    "Test failed for n = " + n
                    + "\nExpected: " + expected
                    + "\nActual:   " + actual
            );
        }

        System.out.println(
                "PASS | n = " + n
                + " | Output = " + actual
        );
    }

    public static void main(String[] args) {

        PrimeNumbers solution = new PrimeNumbers();

        // Test Case 1
        // n = 10
        // Expected: [2, 3, 5, 7]
        testGeneratePrimes(
                solution,
                10,
                Arrays.asList(2, 3, 5, 7)
        );

        // Test Case 2
        // n = 20
        // Expected: [2, 3, 5, 7, 11, 13, 17, 19]
        testGeneratePrimes(
                solution,
                20,
                Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19)
        );

        // Test Case 3
        // n = 2
        // Smallest prime
        // Expected: [2]
        testGeneratePrimes(
                solution,
                2,
                Arrays.asList(2)
        );

        // Test Case 4
        // n = 1
        // No prime numbers
        // Expected: []
        testGeneratePrimes(
                solution,
                1,
                Collections.emptyList()
        );

        // Test Case 5
        // n = 0
        // Expected: []
        testGeneratePrimes(
                solution,
                0,
                Collections.emptyList()
        );

        // Test Case 6
        // Negative number
        // Expected: []
        testGeneratePrimes(
                solution,
                -10,
                Collections.emptyList()
        );

        // Test Case 7
        // n = 3
        // Expected: [2, 3]
        testGeneratePrimes(
                solution,
                3,
                Arrays.asList(2, 3)
        );

        // Test Case 8
        // n = 30
        // Expected: [2, 3, 5, 7, 11, 13, 17, 19, 23, 29]
        testGeneratePrimes(
                solution,
                30,
                Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)
        );

        // Test Case 9
        // n = 50
        testGeneratePrimes(
                solution,
                50,
                Arrays.asList(
                        2, 3, 5, 7, 11, 13, 17, 19,
                        23, 29, 31, 37, 41, 43, 47
                )
        );

        // Test Case 10
        // n = 100
        testGeneratePrimes(
                solution,
                100,
                Arrays.asList(
                        2, 3, 5, 7, 11, 13, 17, 19, 23,
                        29, 31, 37, 41, 43, 47, 53, 59,
                        61, 67, 71, 73, 79, 83, 89, 97
                )
        );

        System.out.println();
        System.out.println("All test cases passed successfully!");
    }
}