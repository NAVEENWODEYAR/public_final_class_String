package com.string;

/**
 * @author Naveen K Wodeyar
 * @date 10-Oct-2025
 */

public class StringUtilsJavaLangDemo {

    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";
        String str3 = "   ";
        String str4 = "OpenAI";

        System.out.println("===== java.lang StringUtils Demo =====");

        // isEmpty
        System.out.println("isEmpty:");
        System.out.println("str1: " + isEmpty(str1)); // true
        System.out.println("str2: " + isEmpty(str2)); // true
        System.out.println("str3: " + isEmpty(str3)); // false
        System.out.println("str4: " + isEmpty(str4)); // false

        // isNotEmpty
        System.out.println("\nisNotEmpty:");
        System.out.println("str1: " + isNotEmpty(str1)); // false
        System.out.println("str2: " + isNotEmpty(str2)); // false
        System.out.println("str3: " + isNotEmpty(str3)); // true
        System.out.println("str4: " + isNotEmpty(str4)); // true

        // isBlank
        System.out.println("\nisBlank:");
        System.out.println("str1: " + isBlank(str1)); // true
        System.out.println("str2: " + isBlank(str2)); // true
        System.out.println("str3: " + isBlank(str3)); // true
        System.out.println("str4: " + isBlank(str4)); // false

        // isNotBlank
        System.out.println("\nisNotBlank:");
        System.out.println("str1: " + isNotBlank(str1)); // false
        System.out.println("str2: " + isNotBlank(str2)); // false
        System.out.println("str3: " + isNotBlank(str3)); // false
        System.out.println("str4: " + isNotBlank(str4)); // true

        // defaultIfEmpty
        System.out.println("\ndefaultIfEmpty:");
        System.out.println("str1: " + defaultIfEmpty(str1, "Default")); // Default
        System.out.println("str2: " + defaultIfEmpty(str2, "Default")); // Default
        System.out.println("str4: " + defaultIfEmpty(str4, "Default")); // OpenAI

        // trimToNull
        System.out.println("\ntrimToNull:");
        System.out.println("str3: " + trimToNull(str3)); // null
        System.out.println("str4: " + trimToNull(str4)); // OpenAI
    }

    // Utility methods using only java.lang

    public static boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    public static boolean isBlank(String str) {
        return str == null || str.trim().isEmpty();
    }

    public static boolean isNotBlank(String str) {
        return !isBlank(str);
    }

    public static String defaultIfEmpty(String str, String defaultStr) {
        return isEmpty(str) ? defaultStr : str;
    }

    public static String trimToNull(String str) {
        if (str == null) return null;
        String trimmed = str.trim();
        return trimmed.isEmpty() ? null : trimmed;
    }
}
