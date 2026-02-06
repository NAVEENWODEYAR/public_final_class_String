package com.string.compare;

/**
 * @author Naveen K Wodeyar
 * @date 06-Feb-2026
 */

public class StringCompareMethods {

	    // 1️⃣ Case-sensitive comparison (manual)
	    public static boolean compareCaseSensitive(String s1, String s2) {
	        if (s1 == null || s2 == null) {
	            return s1 == s2; // both null -> true, else false
	        }

	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        for (int i = 0; i < s1.length(); i++) {
	            if (s1.charAt(i) != s2.charAt(i)) {
	                return false;
	            }
	        }

	        return true;
	    }

	    // 2️⃣ Case-insensitive comparison (manual)
	    public static boolean compareIgnoreCase(String s1, String s2) {
	        if (s1 == null || s2 == null) {
	            return s1 == s2;
	        }

	        if (s1.length() != s2.length()) {
	            return false;
	        }

	        for (int i = 0; i < s1.length(); i++) {
	            char c1 = s1.charAt(i);
	            char c2 = s2.charAt(i);

	            // Convert uppercase to lowercase manually
	            if (c1 >= 'A' && c1 <= 'Z') {
	                c1 = (char)(c1 + 32);
	            }
	            if (c2 >= 'A' && c2 <= 'Z') {
	                c2 = (char)(c2 + 32);
	            }

	            if (c1 != c2) {
	                return false;
	            }
	        }

	        return true;
	    }

	    // 3️⃣ Main method with test cases
	    public static void main(String[] args) {

	        System.out.println("CASE-SENSITIVE TESTS");
	        System.out.println(compareCaseSensitive("hello", "hello")); // true
	        System.out.println(compareCaseSensitive("hello", "world")); // false
	        System.out.println(compareCaseSensitive("Java", "java"));   // false
	        System.out.println(compareCaseSensitive("", ""));           // true
	        System.out.println(compareCaseSensitive(null, null));       // true
	        System.out.println(compareCaseSensitive(null, "test"));     // false

	        System.out.println("\nCASE-INSENSITIVE TESTS");
	        System.out.println(compareIgnoreCase("Java", "java"));      // true
	        System.out.println(compareIgnoreCase("HELLO", "hello"));    // true
	        System.out.println(compareIgnoreCase("Apple", "ApPle"));    // true
	        System.out.println(compareIgnoreCase("abc", "abcd"));       // false
	        System.out.println(compareIgnoreCase(null, null));          // true
	        System.out.println(compareIgnoreCase(null, "hello"));       // false
	    }
	

}
