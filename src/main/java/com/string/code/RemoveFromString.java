package com.string.code;
/**
 * @author Naveen K Wodeyar
 * @date 01-Jul-2024
 */
public class RemoveFromString {

	static String removeWhiteSpaces(String st) {
		return st.replaceAll("\\s", "");
	}
	
	static String removedigits(String st) {
		return st.replaceAll("\\d", "");
	}
	
	static String removeNonDigits(String st) {
		return st.replaceAll("\\D", "");
	}
	
	
	static void removeOther(String st) {
		String newSt = "";
		for(int i=0; i<st.length(); i++) {
			if(!Character.isDigit(st.charAt(i)) && (Character.isLetterOrDigit(st.charAt(i)))) {
				newSt +=st.charAt(i);
			}
		}
		System.out.println("\nOriginal string "+st+"\nNew string "+newSt);
	}
	
	public static void main(String[] args) {
		String st = new String("hello1#  w&orld2");;
		System.out.println("\nOriginal string "+st+"\nAfter removing white spaces"+removeWhiteSpaces(st));
		System.out.println("\nRemoved digits "+removedigits(st));
		System.out.println("\nRemoved nonDigits "+removeNonDigits(st));
		removeOther(st);
	}

}
