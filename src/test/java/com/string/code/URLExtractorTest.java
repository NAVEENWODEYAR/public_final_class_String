package com.string.code;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Naveen K Wodeyar
 * @date 19-May-2025
 */


class URLExtractorTest {

    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void testExtractURLs() {
        URLExtractor extractor = new URLExtractor();
        String input = "Visit https://openai.com and http://example.org/test for more info.";

        extractor.extractURLs(input);

        String output = outputStream.toString().trim();
        assertTrue(output.contains("Found URL: https://openai.com"));
        assertTrue(output.contains("Found URL: http://example.org/test"));
    }

    @Test
    void testExtractURLsWithNoUrls() {
        URLExtractor extractor = new URLExtractor();
        String input = "There are no URLs in this text.";

        extractor.extractURLs(input);

        String output = outputStream.toString().trim();
        assertEquals("", output);
    }
}

