package com.string.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Naveen K Wodeyar
 * @date 18-Jun-2025
 */

public class StringProcessorTest {

    @Test
    public void testProcessText_normalInput() {
        StringProcessor processor = new StringProcessor();
        String input = "  hello   world  ";
        String expected = "DLROW OLLEH";
        assertEquals(expected, processor.processText(input));
    }

    @Test
    public void testProcessText_emptyInput() {
        StringProcessor processor = new StringProcessor();
        String input = "   ";
        String expected = "";
        assertEquals(expected, processor.processText(input));
    }

    @Test
    public void testProcessText_singleWord() {
        StringProcessor processor = new StringProcessor();
        String input = "Java";
        String expected = "AVAJ";
        assertEquals(expected, processor.processText(input));
    }
}
