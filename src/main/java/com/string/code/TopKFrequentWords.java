package com.string.code;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 07-Nov-2025
 */

public class TopKFrequentWords {

    /**
     * Returns the top K most frequent words from the given list.
     *
     * @param words list of words
     * @param k number of top frequent words to return
     * @return list of top K frequent words
     */
    public List<String> findTopKFrequent(String[] words, int k) {
        if (words == null || words.length == 0 || k <= 0) {
            return Collections.emptyList();
        }

        // Step 1: Count frequency of each word
        Map<String, Integer> freq = new HashMap<>();
        for (String word : words) {
            freq.put(word, freq.getOrDefault(word, 0) + 1);
        }

        // Step 2: Sort by frequency (desc), then alphabetically (asc)
        return freq.entrySet().stream()
                .sorted((a, b) -> {
                    int cmp = b.getValue().compareTo(a.getValue());
                    return cmp != 0 ? cmp : a.getKey().compareTo(b.getKey());
                })
                .limit(k)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    // For manual execution
    public static void main(String[] args) {
        TopKFrequentWords obj = new TopKFrequentWords();
        String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
        int k = 2;

        List<String> topK = obj.findTopKFrequent(words, k);
        System.out.println("Top " + k + " frequent words: " + topK);
    }
}
