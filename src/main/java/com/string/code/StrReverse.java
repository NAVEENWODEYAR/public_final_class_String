package com.string.code;

import java.util.stream.*;
/**
 * @author Naveen K Wodeyar
 * @date 01-Jul-2024
 */
public class StrReverse {

	// using StringBuffer and StringBuilder,
	public String reverseString(String st) {
		String rev = "";
		for(int i=st.length()-1; i>=0; i--) {
			rev +=st.charAt(i);
		}
		System.out.println(rev);

		StringBuffer sb = new StringBuffer(st).reverse();
		System.out.println("\nStringBuffer "+sb);
		
		return new StringBuffer(st).reverse().toString();
	}
	
	// using recursion,
	static String stReverse(String st) {
		if(st.isEmpty()) {
			return st;
		}
		return stReverse(st.substring(1))+st.charAt(0);
	}
	
	// using Java8,
	static String stringReverse(String st) {
		return IntStream.rangeClosed(0, st.length())
						.mapToObj(s->st.charAt(st.length()-s-1))
						.map(String::valueOf)
						.collect(Collectors.joining());
	}
	
	public static void main(String[] args) {

		StrReverse s1 = new StrReverse();
		String st = "safari";
		System.out.println("Original string- "+st+"\n Reversed string- "+s1.reverseString(st));
		System.out.println("\n Using Recursion "+stReverse(st));
	}

}
