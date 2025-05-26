package com.string.series;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 26-May-2025
 */

class PalindromeSeriesTest {

    @Test
    void testGeneratePalindromeSeriesFive() {
        List<String> expected = Arrays.asList("aa", "bb", "cc", "dd", "ee");
        List<String> actual = PalindromeSeries.generatePalindromeSeries(5);
        assertEquals(expected, actual);
    }

    @Test
    void testGeneratePalindromeSeriesZero() {
        List<String> expected = List.of();
        List<String> actual = PalindromeSeries.generatePalindromeSeries(0);
        assertEquals(expected, actual);
    }

    @Test
    void testGeneratePalindromeSeriesOne() {
        List<String> expected = List.of("aa");
        List<String> actual = PalindromeSeries.generatePalindromeSeries(1);
        assertEquals(expected, actual);
    }
}
