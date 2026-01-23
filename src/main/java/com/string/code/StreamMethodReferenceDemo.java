package com.string.code;

import java.util.Arrays;
import java.util.List;

/**
 * @author Naveen K Wodeyar
 * @date 22-Jan-2026
 */

public class StreamMethodReferenceDemo {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        // forEach using method reference
        names.stream().forEach(System.out::println);
    }
}
