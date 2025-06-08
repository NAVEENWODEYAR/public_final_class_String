package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 08-Jun-2025
 */

public class TrickyStringExamples {

    // 1. Compile-Time vs Runtime Concatenation
    public boolean compareCompileAndRuntimeConcatenation() {
        String a = "Hello";
        String b = "World";
        String c = "HelloWorld";
        String d = a + b;
        String e = "Hello" + "World";
        return c == e && c != d;
    }

    // 2. Interning Behavior
    public boolean[] checkInterningBehavior() {
        String f = new String("test");
        String g = f.intern();
        String h = "test";
        return new boolean[]{
            f == g,    // false
            g == h,    // true
            f == h     // false
        };
    }

    // 3. String Immutability
    public String testStringImmutability() {
        String s = "Java";
        s.concat("Script");
        return s; // should return "Java"
    }

    // 4. Substring Trap
    public String getSubstringPart() {
        String large = "ThisIsAVeryLargeStringUsedInMemory";
        return large.substring(0, 4); // returns "This"
    }

    // 5. Reverse with StringBuilder
    public String reverseUsingStringBuilder() {
        StringBuilder sb = new StringBuilder("abc");
        return sb.reverse().toString(); // "cba"
    }

    // 6. Equals vs ==
    public boolean[] equalsVsDoubleEquals() {
        String x = "a";
        String y = "b";
        String z = "ab";
        String xy = x + y;
        return new boolean[]{
            z == xy,         // false
            z.equals(xy)     // true
        };
    }

    // 7. Intern with new String()
    public boolean testInternWithNewString() {
        String i = "intern";
        String j = new String("intern").intern();
        return i == j; // true
    }
}
