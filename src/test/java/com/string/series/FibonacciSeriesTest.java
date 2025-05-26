package com.string.series;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 26-May-2025
 */

class FibonacciSeriesTest {

    @Test
    void testGenerateFibonacciSeries() {
        List<Integer> expected = Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34);
        List<Integer> actual = FibonacciSeries.generateFibonacciSeries(10);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateFibonacciSeriesZero() {
        List<Integer> expected = List.of();
        List<Integer> actual = FibonacciSeries.generateFibonacciSeries(0);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateFibonacciSeriesOne() {
        List<Integer> expected = List.of(0);
        List<Integer> actual = FibonacciSeries.generateFibonacciSeries(1);
        assertEquals(expected, actual);
    }

    @Test
    void testGenerateFibonacciSeriesTwo() {
        List<Integer> expected = List.of(0, 1);
        List<Integer> actual = FibonacciSeries.generateFibonacciSeries(2);
        assertEquals(expected, actual);
    }
}
