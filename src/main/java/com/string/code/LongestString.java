package com.string.code;

import java.util.*;
import java.util.stream.*;

/**
 * @author Naveen K Wodeyar
 * @date 23-Jul-2025
 */

public class LongestString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "pear", "grapefruit", "kiwi");

        Optional<String> longest = words.stream()
            .max(Comparator.comparingInt(String::length));

        System.out.println(longest.orElse("None"));
    }
}
