package com.string.code;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Naveen K Wodeyar
 * @date 29-May-2025
 */

public class DuplicateCharacters {
    public static Set<Character> findDuplicates(String s) {
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (!seen.add(c)) {
                duplicates.add(c);
            }
        }
        return duplicates;
    }

    public static void main(String[] args) {
        System.out.println("Duplicate characters: " + findDuplicates("programming"));
    }
}
