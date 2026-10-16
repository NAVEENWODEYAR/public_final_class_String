package com.string.compare;

/**
 * Demonstrates tricky behaviors and common interview questions 
 * regarding the Java String Constant Pool.
 * 
 * @author NaveenWodeyar
 * @date 16-Oct-2026
 */
public class StringPoolTricky {

    public static void main(String[] args) {
    	
        System.out.println("=== String Constant Pool Tricky Scenarios ===\n");

        // Scenario 1: String Literals vs. New Keyword
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s7 = new String("Java");


        System.out.println("1. Literals check (s1 == s2): " + (s1 == s2)); 
        // Expected: true -> Both point to the exact same object in the String Constant Pool.

        System.out.println("2. Literal vs New (s1 == s3): " + (s1 == s3)); 
        // Expected: false -> s1 is in the pool, but s3 creates a new object in the Heap.

        System.out.println("   Content check using .equals (s1.equals(s3)): " + s1.equals(s3)); 
        // Expected: true -> .equals() compares the actual character values, not memory references.
        System.out.println("   Content check using .equals (s1.equals(s3)): " + s1.equals(s7)); 

        // Scenario 2: The intern() Method
        String s4 = s3.intern();
        System.out.println("3. Interned check (s1 == s4): " + (s1 == s4)); 
        // Expected: true -> .intern() returns the reference from the pool if it exists.

        // Scenario 3: Compile-time Constant Folding vs. Runtime Concatenation
        String s5 = "Ja" + "va"; 
        // Compiler optimizes this at compile-time into a single literal: "Java"
        System.out.println("4. Compile-time Concat (s1 == s5): " + (s1 == s5)); 
        // Expected: true -> Resolved during compilation, points straight to the pool.

        String prefix = "Ja";
        String s6 = prefix + "va"; 
        // Evaluated at runtime using StringBuilder because 'prefix' is a variable reference.
        System.out.println("5. Runtime Concat (s1 == s6): " + (s1 == s6)); 
        // Expected: false -> Created dynamically in the heap at runtime.

        System.out.println("\n=== Demonstration Completed Successfully ===");
    }
}