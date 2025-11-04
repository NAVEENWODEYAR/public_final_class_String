package com.string.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 04-Nov-2025
 */

public class NullPointerExampleTest {

    @Test
    public void testProcessStringWithNull() {
        NullPointerExample example = new NullPointerExample();
        String result = example.processString(null);

        assertEquals("Caught a NullPointerException! The string was null.", result);
    }

    @Test
    public void testProcessStringWithNonNull() {
        NullPointerExample example = new NullPointerExample();
        String result = example.processString("Hello");

        assertEquals("Length of string: 5", result);
    }
}

