package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 11-Jan-2026
 */

public class StringInterviewTricks {

    public static void main(String[] args) {

        System.out.println("1️. String Literal vs new String");
        String s1 = "Java";
        String s2 = new String("Java");
        System.out.println(s1 == s2);        // false
        System.out.println(s1.equals(s2));   // true

        System.out.println("\n2️. Compile-time Concatenation");
        String s3 = "Ja" + "va";
        System.out.println(s1 == s3);        // true

        System.out.println("\n3️. Runtime Concatenation");
        String a = "Ja";
        String b = "va";
        String s4 = a + b;
        System.out.println(s1 == s4);        // false

        System.out.println("\n4️. final Keyword Trick");
        final String x = "Ja";
        final String y = "va";
        String s5 = x + y;
        System.out.println(s1 == s5);        // true

        System.out.println("\n5️. intern() Method");
        String s6 = new String("Java");
        String s7 = s6.intern();
        System.out.println(s6 == s7);        // false
        System.out.println(s7 == s1);        // true

        System.out.println("\n6️. Immutability");
        String s8 = "Hello";
        s8.concat(" World");
        System.out.println(s8);              // Hello

        System.out.println("\n7️. StringBuilder equals()");
        String s9 = "Java";
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(s9.equals(sb));   // false

        System.out.println("\n8️. Null Safe Comparison");
        String s10 = null;
        System.out.println("Java".equals(s10)); // false

        System.out.println("\n9️. HashCode Check");
        String s11 = "Java";
        String s12 = new String("Java");
        System.out.println(s11.hashCode());
        System.out.println(s12.hashCode());  // same value

        System.out.println("\n10. Reference Copy");
        String s13 = "Java";
        String s14 = s13;
        System.out.println(s13 == s14);      // true
    }
    
}
