package com.string.series;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 26-May-2025
 */

class FibonacciSquareTest {

    @Test
    void testGenerateSeries() {
        List<Integer> expected = Arrays.asList(1, 0, 9, 1, 25, 1, 49, 2, 81, 3);
        List<Integer> actual = FibonacciSquare.generateSeries(10);
        assertEquals(expected, actual);
    }

    @Test
    void testEmptySeries() {
        List<Integer> expected = List.of();
        List<Integer> actual = FibonacciSquare.generateSeries(0);
        assertEquals(expected, actual);
    }

    @Test
    void testSingleElement() {
        List<Integer> expected = List.of(1);
        List<Integer> actual = FibonacciSquare.generateSeries(1);
        assertEquals(expected, actual);
    }
}
