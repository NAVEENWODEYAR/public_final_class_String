package com.string.compare;

/**
 * Test cases demonstrating the difference between == and .equals() in Java strings.
 * 
 * @author Naveen K Wodeyar
 * @date 05-Nov-2026
 */
public class StringComparisonTest {

    public static void main(String[] args) {
        System.out.println("=== RUNNING STRING COMPARISON TEST CASES ===");
        
        testLiteralVsLiteral();
        testLiteralVsNewString();
        testNewStringVsNewString();
        testInternedString();
        
        System.out.println("\nAll tests completed!");
    }

    // Test 1: Two string literals
    public static void testLiteralVsLiteral() {
        String s1 = "Java";
        String s2 = "Java";
        
        System.out.println("\nTest 1: Literal vs Literal (\"Java\" & \"Java\")");
        System.out.println("  == operator : " + (s1 == s2) + " (Expected: true)");
        System.out.println("  .equals()   : " + s1.equals(s2) + " (Expected: true)");
    }

    // Test 2: Literal vs New String object
    public static void testLiteralVsNewString() {
        String s1 = "Java";
        String s2 = new String("Java");
        
        System.out.println("\nTest 2: Literal vs New String (\"Java\" & new String(\"Java\"))");
        System.out.println("  == operator : " + (s1 == s2) + " (Expected: false)");
        System.out.println("  .equals()   : " + s1.equals(s2) + " (Expected: true)");
    }

    // Test 3: Two separate New String objects in heap
    public static void testNewStringVsNewString() {
        String s1 = new String("Java");
        String s2 = new String("Java");
        
        System.out.println("\nTest 3: New String vs New String (Two separate heap objects)");
        System.out.println("  == operator : " + (s1 == s2) + " (Expected: false)");
        System.out.println("  .equals()   : " + s1.equals(s2) + " (Expected: true)");
    }

    // Test 4: Literal vs Interned New String
    public static void testInternedString() {
        String s1 = "Java";
        String s2 = new String("Java").intern();
        
        System.out.println("\nTest 4: Literal vs Interned New String");
        System.out.println("  == operator : " + (s1 == s2) + " (Expected: true)");
        System.out.println("  .equals()   : " + s1.equals(s2) + " (Expected: true)");
    }
}