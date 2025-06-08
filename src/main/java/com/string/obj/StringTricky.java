package com.string.obj;

/**
 * @author Naveen K Wodeyar
 * @date 08-Jun-2025
 */

public class StringTricky {
    public static void main(String[] args) {
        String a = "OpenAI";
        String b = "OpenAI";
        String c = new String("OpenAI");
        String d = c.intern();

        System.out.println("a == b: " + (a == b));           // true
        System.out.println("a == c: " + (a == c));           // false
        System.out.println("a.equals(c): " + a.equals(c));   // true
        System.out.println("a == d: " + (a == d));           // true
    }
}

