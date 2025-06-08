package com.string.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 08-Jun-2025
 */

public class TrickyStringExamplesTest {

    TrickyStringExamples example = new TrickyStringExamples();

    @Test
    void testCompileAndRuntimeConcatenation() {
        assertTrue(example.compareCompileAndRuntimeConcatenation());
    }

    @Test
    void testInterningBehavior() {
        boolean[] results = example.checkInterningBehavior();
        assertFalse(results[0]); // f == g
        assertTrue(results[1]);  // g == h
        assertFalse(results[2]); // f == h
    }

    @Test
    void testStringImmutability() {
        assertEquals("Java", example.testStringImmutability());
    }

    @Test
    void testSubstringPart() {
        assertEquals("This", example.getSubstringPart());
    }

    @Test
    void testStringBuilderReverse() {
        assertEquals("cba", example.reverseUsingStringBuilder());
    }

    @Test
    void testEqualsVsDoubleEquals() {
        boolean[] results = example.equalsVsDoubleEquals();
        assertFalse(results[0]); // z == xy
        assertTrue(results[1]);  // z.equals(xy)
    }

    @Test
    void testInternWithNewString() {
        assertTrue(example.testInternWithNewString());
    }
}
