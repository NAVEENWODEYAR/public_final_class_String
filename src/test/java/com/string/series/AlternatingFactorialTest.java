package com.string.series;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 22-May-2025
 */

public class AlternatingFactorialTest {

    @Test
    public void testAlternatingFactorialSum() {
        assertEquals(521, AlternatingFactorial.alternatingFactorialSum(6)); // 1! - 2! + 3! - 4! + 5! - 6!
        assertEquals(1, AlternatingFactorial.alternatingFactorialSum(1));    // 1!
        assertEquals(-1, AlternatingFactorial.alternatingFactorialSum(2));   // 1! - 2!
        assertEquals(5, AlternatingFactorial.alternatingFactorialSum(3));    // 1! - 2! + 3!
        assertEquals(-19, AlternatingFactorial.alternatingFactorialSum(4));  // 1! - 2! + 3! - 4!
    }
}

