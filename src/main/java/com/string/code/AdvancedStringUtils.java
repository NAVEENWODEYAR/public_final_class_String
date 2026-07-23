package com.string.code;

import java.util.stream.Collectors;

/**
 * @author Naveen K Wodeyar
 * @date 12-Jun-2025
 */

public class AdvancedStringUtils {

    public static int getCodePointAt(String str, int index) {
        return str.codePointAt(index);
    }

    public static int offsetByCodePoints(String str, int index, int offset) {
        return str.offsetByCodePoints(index, offset);
    }

    public static boolean matchesRegex(String str, String regex) {
        return str.matches(regex);
    }

    public static boolean regionMatches(String str1, int toffset, String str2, int ooffset, int len) {
        return str1.regionMatches(toffset, str2, ooffset, len);
    }

    public static String internString(String str) {
        return str.intern();
    }

    public static String stripWhitespace(String str) {
        return str.strip(); // Java 11+
    }

    public static String repeatString(String str, int count) {
        return str.repeat(count);
    }

    public static String escapeUnicode(String str) {
        return str.codePoints()
                  .mapToObj(cp -> String.format("\\u%04X", cp))
                  .collect(Collectors.joining());
    }

    public static boolean containsSurrogatePair(String str) {
        return str.codePoints().anyMatch(cp -> Character.isSupplementaryCodePoint(cp));
    }

    public static String indentString(String str, int n) {
System.out.println("indent string");
        return str.indent(n); // Java 12+
    }
}
