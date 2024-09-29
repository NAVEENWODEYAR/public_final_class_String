package com.string.code;

import java.util.Arrays;

/**
 * @author Naveen K Wodeyar
 * @date 07-Jul-2024
 */
public class StringSplit {

	public String stringSplit(String st) {
		String[] split = st.toLowerCase().split(" ");
		System.out.println("\nString "+st+"\n Array "+Arrays.toString(split));
        System.out.printf("\nString: %s\nArray: %s%n", st, Arrays.toString(split));
		 String string = Arrays.toString(split);
		 System.out.println(string.getClass());
		return Arrays.toString(split);
	}
	
	public static void main(String[] args) {
		StringSplit stringSplit = new StringSplit();
		stringSplit.stringSplit("String");
	}

}
