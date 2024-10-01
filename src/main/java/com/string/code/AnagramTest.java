package com.string.code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 01-Oct-2024
 */
public class AnagramTest {
	
	public int stringToInt(String input) {
	    return input.chars()
	                .map(c -> c - '0')
	                .reduce(0, (result, digit) -> result * 10 + digit);
	}

	public String capitalizeFirstLetter(String sentence) {
	    return Arrays.stream(sentence.split(" "))
	                 .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
	                 .collect(Collectors.joining(" "));
	}

	public Map<Character, Long> characterFrequency(String input) {
	    return input.chars()
	                .mapToObj(c -> (char) c)
	                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
	}

	public String findLongestWord(String sentence) {
	    return Arrays.stream(sentence.split(" "))
	                 .max(Comparator.comparingInt(String::length))
	                 .orElse("");
	}
	
	public String removeDuplicates(String input) {
	    return input.chars()
	                .distinct()
	                .mapToObj(c -> (char) c)
	                .map(String::valueOf)
	                .collect(Collectors.joining());
	}

	public Map<String, Long> countVowelsAndConsonants(String input) {
	    long vowelCount = input.chars()
	                            .filter(c -> "aeiouAEIOU".indexOf(c) != -1)
	                            .count();
	    long consonantCount = input.chars()
	                                .filter(c -> Character.isLetter(c) && "aeiouAEIOU".indexOf(c) == -1)
	                                .count();
	    return Map.of("vowels", vowelCount, "consonants", consonantCount);
	}



}
