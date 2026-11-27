package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 28-Aug-2025
 */

public class StringImmutabilityDemo {
	
    public static void main(String[] args) {
    	
    	main1(new String[0]);
    	
        String original = "Hello";
        System.out.println("Original String: " + original);

        // Attempt to change the string using concatenation
        String modified = original.concat(" World");

        // Display results
        System.out.println("After Concatenation:");
        System.out.println("Original String: " + original);
        System.out.println("Modified String: " + modified);

        // Check if both strings refer to the same object
        if (original == modified) {
            System.out.println("Both strings are the same object.");
        } else {
            System.out.println("Original and Modified strings are different objects.");
        }
    }
    
    /**
     * Runs the string immutability and reference-identity demonstration.
     *
     * @param args command-line arguments (not used)
     */
    public static void main1(String[] args) {
        // 1. Create a String literal in the String Constant Pool and share its reference
        String original = "Java";
        String alias = original; // Both variables point to the same "Java" instance

        // 2. Invoke concat() without capturing/reassigning the returned String
        // The original "Java" object remains unchanged
        original.concat(" 21");
        System.out.println("After concat (unassigned): " + original); // Prints "Java"

        // 3. Reassign 'original' to the new String returned by concat()
        // 'alias' continues pointing to the untouched "Java" instance
        original = original.concat(" 21");
        System.out.println("After concat (reassigned): " + original); // Prints "Java 21"
        System.out.println("Alias still points to:      " + alias);    // Prints "Java"

        // 4. Compare object references with '==' (false because they now point to different objects)
        System.out.println("original == alias: " + (original == alias));

        // 5. Contrast with StringBuilder, which modifies its internal character buffer in place
        StringBuilder sb = new StringBuilder("Java");
        StringBuilder sbAlias = sb; // Points to the same mutable StringBuilder instance
        sb.append(" 21");            // Mutates the existing object rather than creating a new one
        System.out.println("\nStringBuilder after append: " + sb);        // Prints "Java 21"
        System.out.println("sb == sbAlias:              " + (sb == sbAlias)); // Prints true
    }
    
}
