package com.string.code;

import java.util.*;
import java.util.stream.*;
	
/**
 * @author Naveen K Wodeyar
 * @date 10-Feb-2026
 */

public class CounterDemoUsingStreams {


	    // LeetCode-style method using streams
	    public static int[] counter(int n) {
	        return IntStream
	                .rangeClosed(1, n)   // generates 1 to n
	                .toArray();
	    }

	    // Main method with test cases
	    public static void main(String[] args) {

	        // Test Case 1
	        int n1 = 5;
	        System.out.println("Input: n = " + n1);
	        System.out.println("Output: " + Arrays.toString(counter(n1)));

	        // Test Case 2
	        int n2 = 1;
	        System.out.println("\nInput: n = " + n2);
	        System.out.println("Output: " + Arrays.toString(counter(n2)));

	        // Test Case 3
	        int n3 = 0;
	        System.out.println("\nInput: n = " + n3);
	        System.out.println("Output: " + Arrays.toString(counter(n3)));
	    }
	}
