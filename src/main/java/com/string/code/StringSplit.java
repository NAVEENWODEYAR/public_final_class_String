package com.string.code;

import java.util.Arrays;

/**
 * @author Naveen K Wodeyar
 * @date 07-Jul-2024
 */
public class StringSplit {

	public static String[] stringSplit(String st) {
		String[] split = st.toLowerCase().split(" ");
		System.out.println("\nString "+st+"\n Array "+Arrays.toString(split));
		return split;
	}
	public static void main(String[] args) {
		stringSplit("String");
	}

}
