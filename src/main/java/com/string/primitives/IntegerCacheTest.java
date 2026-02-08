package com.string.primitives;

/**
 * @author Naveen K Wodeyar
 * @date 07-Feb-2026
 */

public class IntegerCacheTest {

    public static void main(String[] args) {

        Integer a = 127;
        Integer b = 127;

        Integer c = 128;
        Integer d = 128;

        System.out.println(a == b); // true
        System.out.println(c == d); // false
    }
    
}
