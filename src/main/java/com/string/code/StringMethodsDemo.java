package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 12-Jun-2025
 */

public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "  Hello, Java World!  ";
        String str2 = "hello, java world!";
        String str3 = "Java";

        // Basic methods
        System.out.println("Original: '" + str + "'");
        System.out.println("Length: " + str.length());
        System.out.println("Char at 7: " + str.charAt(7));
        System.out.println("Substring (2 to 7): '" + str.substring(2, 7) + "'");
        System.out.println("Index of 'Java': " + str.indexOf("Java"));
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));
        System.out.println("Starts with '  He': " + str.startsWith("  He"));
        System.out.println("Ends with 'ld!  ': " + str.endsWith("ld!  "));
        System.out.println("Contains 'Java': " + str.contains("Java"));

        // Comparison methods
        System.out.println("Equals: " + str.equals(str2));
        System.out.println("Equals Ignore Case: " + str.trim().equalsIgnoreCase(str2.trim()));

        // Case conversion
        System.out.println("To Upper Case: " + str.toUpperCase());
        System.out.println("To Lower Case: " + str.toLowerCase());

        // Trim and Replace
        System.out.println("Trim: '" + str.trim() + "'");
        System.out.println("Replace 'Java' with 'Python': " + str.replace("Java", "Python"));
        System.out.println("Replace all spaces with '_': " + str.replaceAll(" ", "_"));
        System.out.println("ReplaceFirst 'l' with 'L': " + str.replaceFirst("l", "L"));

        // Split and Join
        String[] words = str.trim().split(" ");
        System.out.println("Split:");
        for (String word : words) {
            System.out.println("- " + word);
        }
        String joined = String.join("-", words);
        System.out.println("Joined with '-': " + joined);

        // isEmpty and isBlank (Java 11+)
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("Is emptyStr empty? " + emptyStr.isEmpty());
        System.out.println("Is blankStr blank? " + blankStr.isBlank());

        // Interning
        String intern1 = new String("Intern").intern();
        String intern2 = "Intern";
        System.out.println("Are interned strings equal (==)? " + (intern1 == intern2));

        // Format
        String formatted = String.format("My name is %s and I am %d years old.", "Alice", 25);
        System.out.println("Formatted: " + formatted);

        // Code point methods
        System.out.println("Code point at index 2: " + str.codePointAt(2));
        System.out.println("Code point count (2 to 10): " + str.codePointCount(2, 10));

        // Concat
        System.out.println("Concat with str3: " + str.concat(str3));

        // toCharArray
        char[] chars = str.toCharArray();
        System.out.print("Characters: ");
        for (char c : chars) {
            System.out.print(c + " ");
        }
        System.out.println();

        // ValueOf
        int num = 123;
        String numStr = String.valueOf(num);
        System.out.println("String value of int: " + numStr);
    }
}
