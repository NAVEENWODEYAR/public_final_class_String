package com.string.java21;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 03-Oct-2024
 */
public class StringUtils {

	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	public static boolean isPalindrome(String str) {
		return str.equals(new StringBuilder(str).reverse().toString());
	}
	
	    public static long countVowels(String str) {
	        return str.chars()
	                  .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
	                  .count();
	    }
	
	    public static long countVowels21(String str) {
	        return str.chars()
	                  .filter(c -> "aeiou".indexOf(Character.toLowerCase(c)) != -1)
	                  .count();
	    }

	    public static String removeDuplicates(String str) {
	        return new LinkedHashSet<>(str.chars()
	                                       .mapToObj(c -> (char) c)
	                                       .collect(Collectors.toList()))
	                .stream()
	                .map(String::valueOf)
	                .collect(Collectors.joining());
	    }
	    
	    public static String removeDuplicates21(String str) {
	        return str.chars()
	                  .mapToObj(c -> (char) c)
	                  .collect(Collectors.toCollection(LinkedHashSet::new))
	                  .stream()
	                  .map(String::valueOf)
	                  .collect(Collectors.joining());
	    }
	    
	    public static Character firstNonRepeating(String str) {
	        return str.chars()
	                  .mapToObj(c -> (char) c)
	                  .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
	                  .entrySet()
	                  .stream()
	                  .filter(entry -> entry.getValue() == 1)
	                  .map(Map.Entry::getKey)
	                  .findFirst()
	                  .orElse(null);
	    }
	    
	    public static boolean areAnagrams(String str1, String str2) {
	        var arr1 = str1.strip().toLowerCase().toCharArray();
	        var arr2 = str2.strip().toLowerCase().toCharArray();
	        Arrays.sort(arr1);
	        Arrays.sort(arr2);
	        return Arrays.equals(arr1, arr2);
	    }
	    
	    public static String capitalizeWords(String str) {
	        return Arrays.stream(str.split(" "))
	                     .map(word -> Character.toUpperCase(word.charAt(0)) + word.substring(1))
	                     .collect(Collectors.joining(" "));
	    }
	    
	    public static Map<Character, Long> countCharacterFrequencies(String str) {
	        return str.chars()
	                  .mapToObj(c -> (char) c)
	                  .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	    }
	    
	    public static String joinStrings(String... strings) {
	        return String.join(",", strings);
	    }
	    public static String findLongestWord(String str) {
	        return Arrays.stream(str.split(" "))
	                     .reduce((longest, current) -> current.length() > longest.length() ? current : longest)
	                     .orElse("");
	    }


}
