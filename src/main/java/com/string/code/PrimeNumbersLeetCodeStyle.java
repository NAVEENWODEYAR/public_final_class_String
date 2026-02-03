package com.string.code;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 03-Feb-2026
 */

public class PrimeNumbersLeetCodeStyle {

    /* ================= APPROACH 1: Naive ================= */
    static boolean isPrimeNaive(int n) {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /* ================= APPROACH 2: √n Optimized ================= */
    static boolean isPrimeSqrt(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /* ================= APPROACH 3: Skip Even Numbers ================= */
    static boolean isPrimeOptimized(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    /* ================= APPROACH 4: Sieve of Eratosthenes ================= */
    static List<Integer> sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);

        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) primes.add(i);
        }
        return primes;
    }

    /* ================= LEETCODE-STYLE TESTING ================= */
    static void runTest(int n, boolean expected) {
        boolean result1 = isPrimeNaive(n);
        boolean result2 = isPrimeSqrt(n);
        boolean result3 = isPrimeOptimized(n);

        System.out.println("Input: " + n);
        System.out.println("Expected: " + expected);
        System.out.println("Naive: " + result1);
        System.out.println("Sqrt Optimized: " + result2);
        System.out.println("Fully Optimized: " + result3);
        System.out.println("Result: " +
                ((result1 == expected &&
                  result2 == expected &&
                  result3 == expected) ? "PASS ✅" : "FAIL ❌"));
        System.out.println("----------------------------------");
    }

    /* ================= MAIN ================= */
    public static void main(String[] args) {

        // 🔹 LeetCode-style test cases
        runTest(1, false);
        runTest(2, true);
        runTest(3, true);
        runTest(4, false);
        runTest(17, true);
        runTest(25, false);
        runTest(29, true);
        runTest(100, false);

        // 🔹 Sieve test (range-based)
        int n = 50;
        System.out.println("Prime numbers up to " + n + ":");
        System.out.println(sieve(n));
    }
    
}
