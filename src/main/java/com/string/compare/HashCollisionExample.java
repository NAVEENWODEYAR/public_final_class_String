package com.string.compare;

/**
 * @author Naveen K Wodeyar
 * @date 06-Jun-2025
 */

public class HashCollisionExample {
    public static void main(String[] args) {
        String s1 = "FB";
        String s2 = "Ea";

        System.out.println("s1.hashCode(): " + s1.hashCode()); // 2236
        System.out.println("s2.hashCode(): " + s2.hashCode()); // 2236

        System.out.println("s1.equals(s2): " + s1.equals(s2)); // false
    }
}
