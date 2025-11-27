package com.string.code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 25-Nov-2025
 */

public class StringStorageCalculatorTest {

    @Test
    void testEmptyString() {
        assertEquals(0, StringStorageCalculator.getStorageSizeInBytes(""));
    }

    @Test
    void testNullString() {
        assertEquals(0, StringStorageCalculator.getStorageSizeInBytes(null));
    }

    @Test
    void testAsciiString() {
        assertEquals(5, StringStorageCalculator.getStorageSizeInBytes("Hello"));
    }

    @Test
    void testUnicodeString() {
        // "世界" consists of two Chinese characters
        // Each is 3 bytes in UTF-8, so expected = 6
        assertEquals(6, StringStorageCalculator.getStorageSizeInBytes("世界"));
    }

    @Test
    void testMixedCharacters() {
        // "A😊" = 1 byte + 4 bytes (emoji)
        assertEquals(5, StringStorageCalculator.getStorageSizeInBytes("A😊"));
    }
}
