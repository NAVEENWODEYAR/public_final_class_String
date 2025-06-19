package com.string.methods;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 19-Jun-2025
 */

class SubstringTestTest {

    @Test
    void testEmptySubstring() {
        String s = "abcde";
        String result = SubstringTest.getSubstring(s, 2, 2);
        assertEquals("", result, "Expected an empty substring when start == end");
    }

    @Test
    void testSingleCharSubstring() {
        String s = "abcde";
        String result = SubstringTest.getSubstring(s, 2, 3);
        assertEquals("c", result, "Expected substring 'c' from index 2 to 3");
    }

    @Test
    void testFullSubstring() {
        String s = "abcde";
        String result = SubstringTest.getSubstring(s, 1, 4);
        assertEquals("bcd", result, "Expected substring 'bcd' from index 1 to 4");
    }

    @Test
    void testInvalidSubstring() {
        String s = "abcde";
        assertThrows(StringIndexOutOfBoundsException.class, () -> {
            SubstringTest.getSubstring(s, 3, 2);
        }, "Expected exception for start > end");
    }
}
