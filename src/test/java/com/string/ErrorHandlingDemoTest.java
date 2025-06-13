package com.string;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 13-Jun-2025
 */

public class ErrorHandlingDemoTest {

    ErrorHandlingDemo demo = new ErrorHandlingDemo();

    @Test
    public void testSafeStackOverflow() {
        String result = demo.safeStackOverflow();
        assertEquals("Caught StackOverflowError", result);
    }

    @Test
    public void testSafeOutOfMemory() {
        String result = demo.safeOutOfMemory();
        assertEquals("Caught OutOfMemoryError", result);
    }

    @Test
    public void testSafeNoClassDefFound() {
        String result = demo.safeNoClassDefFound();
        // Can be either ClassNotFoundException or NoClassDefFoundError
        assertTrue(result.equals("Caught ClassNotFoundException") || 
                   result.equals("Caught NoClassDefFoundError"));
    }
}
