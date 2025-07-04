package com.string.obj;

import java.util.function.Consumer;

/**
 * @author Naveen K Wodeyar
 * @date 03-Jul-2025
 */

public class StringImmutabilityJava8 {
    public static void main(String[] args) {

        Consumer<String> print = s -> System.out.println(s);

        String original = "Hello";
        String copy = original;

        print.accept("Before modification:");
        print.accept("original: " + original);
        print.accept("copy:     " + copy);

        // Modify original (actually creates a new String)
        original = original.concat(" World"); // same as original + " World"

        print.accept("\nAfter modification:");
        print.accept("original: " + original);
        print.accept("copy:     " + copy);

        print.accept("\nAre original and copy the same object?");
        print.accept(String.valueOf(original == copy)); // false
    }
}
