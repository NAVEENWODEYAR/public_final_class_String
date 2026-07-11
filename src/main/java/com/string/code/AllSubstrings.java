package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 13-Feb-2026
 */

public class AllSubstrings {
    public static void main(String[] args) {
        String str = "abc";
System.out.println(" Substrings in String");

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }
    }
    
}
