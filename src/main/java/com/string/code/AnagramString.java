package com.string.code;
/**
 * @author Naveen K Wodeyar
 * @date 01-Oct-2024
 */
import java.util.Arrays;

public class AnagramString {

	    public static boolean areAnagrams(String str1, String str2) {
	        // Null or empty checks
	        if (str1 == null || str2 == null) return false;
	        if (str1.length() != str2.length()) return false;

	        // Convert strings to character arrays, sort them, and compare
	        char[] charArray1 = str1.toLowerCase().toCharArray();
	        char[] charArray2 = str2.toLowerCase().toCharArray();
	        
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);
	        
	        return Arrays.equals(charArray1, charArray2);
	    }

	    public static void main(String[] args) {
	        // Test cases
	        String str1 = "listen";
	        String str2 = "silent";
	        String str3 = "hello";

	        System.out.println(areAnagrams(str1, str2)); // true
	        System.out.println(areAnagrams(str1, str3)); // false
	    }

}
