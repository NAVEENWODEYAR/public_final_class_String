/**
 * @author Naveen K Wodeyar
 * @date 03-Jul-2025
 */
package com.string.obj;

public class StringImmutabilityTest {
    public static void main(String[] args) {
        String original = "Hello";
        String copy = original; // copy points to the same string

        System.out.println("Before modification:");
        System.out.println("original: " + original); // Hello
        System.out.println("copy:     " + copy);     // Hello

        // Attempt to modify the original
        original = original + " World";

        System.out.println("\nAfter modification:");
        System.out.println("original: " + original); // Hello World
        System.out.println("copy:     " + copy);     // Still Hello

        // Check if both references point to the same object
        System.out.println("\nAre original and copy the same object?");
        System.out.println(original == copy); // false
    }
}
