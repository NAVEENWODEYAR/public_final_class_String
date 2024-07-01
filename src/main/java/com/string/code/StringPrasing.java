package com.string.code;

import java.util.*;
/**
 * @author Naveen K Wodeyar
 * @date 01-Jul-2024
 * @apiNote Counting the number of occurrences of a character in a string,
 */
public class StringPrasing {

	static Integer strToInt(String st) {
		return Integer.parseInt(st)+Integer.parseInt(st);
	}
	
	// using for loop,
	static Integer chCount(String st,char ch) {
		int chCount=0;
		
		for(int i=0; i<st.length(); i++) {
			if(ch== st.charAt(i)) {
				chCount++;
			}
		}
		return chCount;
	}
	
	// using hashMap,
	static Integer charCount(String st,char ch) {
		Map<Character, Integer> map = new HashMap<>();
		
		for(char c: st.toLowerCase().toCharArray()) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		return map.getOrDefault(ch, 0);	
	}
	
	
	// Using replaceAll and String Length,
	static Integer chLen(String st,char c) {
		int newLen = st.replaceAll(String.valueOf(c),"").length();
		return st.length()-newLen;
	}
	
	// Using Java streams,
	static Integer characterLength(String s,char ch) {
		//return s.chars().boxed().filter(c->c==ch).count();
		int targetChar = (int) ch;
        return (int) s.chars().filter(c -> c == targetChar).count();
	}
	
	
	public static void main(String[] args) {
		System.out.println(strToInt("1"));
		System.out.println("************");
		String st = new String("null");
		char c = 'l';
		System.out.println(charCount(st, c));
		System.out.println("\nCharacter "+c+", found "+chCount(st, c)+" times in the string "+st);
		System.out.println("\n**********");
		System.out.println("Using replaceAll() and length() "+chLen(st, c));
		System.out.println("\n***********");
		System.out.println(characterLength(st, c));
	}
}
