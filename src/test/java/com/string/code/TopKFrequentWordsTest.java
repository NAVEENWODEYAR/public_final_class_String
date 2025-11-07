package com.string.code;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TopKFrequentWordsTest {

    private final TopKFrequentWords service = new TopKFrequentWords();

    @Test
    void testBasicScenario() {
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        List<String> result = service.findTopKFrequent(words, 2);
        assertEquals(List.of("apple", "banana"), result);
    }

    @Test
    void testSingleWordRepeated() {
        String[] words = {"java", "java", "java"};
        List<String> result = service.findTopKFrequent(words, 1);
        assertEquals(List.of("java"), result);
    }

    @Test
    void testMultipleWordsSameFrequency() {
        String[] words = {"cat", "dog", "bat"};
        List<String> result = service.findTopKFrequent(words, 2);
        // Sorted alphabetically since frequencies are equal
        assertEquals(List.of("bat", "cat"), result);
    }

    @Test
    void testEmptyArray() {
        String[] words = {};
        List<String> result = service.findTopKFrequent(words, 3);
        assertTrue(result.isEmpty());
    }

    @Test
    void testKGreaterThanWords() {
        String[] words = {"java", "python"};
        List<String> result = service.findTopKFrequent(words, 5);
        assertEquals(List.of("java", "python"), result);
    }

    @Test
    void testNullInput() {
        List<String> result = service.findTopKFrequent(null, 3);
        assertTrue(result.isEmpty());
    }

    @Test
    void testKIsZero() {
        String[] words = {"one", "two", "three"};
        List<String> result = service.findTopKFrequent(words, 0);
        assertTrue(result.isEmpty());
    }
}

