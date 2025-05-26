package com.string.series;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Naveen K Wodeyar
 * @date 08-Jul-2024
 * @apiNote 
 */

public class FibonacciSeries {

    /**
     * Generates a list of Fibonacci numbers using Java Streams.
     *
     * @param n number of Fibonacci terms to generate
     * @return List of first n Fibonacci numbers
     */
    public static List<Integer> generateFibonacciSeries(int n) {
        return Stream.iterate(new int[]{0, 1}, s -> new int[]{s[1], s[0] + s[1]})
                     .limit(n)
                     .map(x -> x[0])
                     .toList();
    }

    public static void main(String[] args) {
        List<Integer> fibList = generateFibonacciSeries(15);
        fibList.forEach(f -> System.out.print(f + ","));
    }
}

