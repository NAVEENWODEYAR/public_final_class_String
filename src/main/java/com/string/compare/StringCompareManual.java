package com.string.compare;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 06-Feb-2026
 */

public class StringCompareManual {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        boolean isEqual = true;

        // Step 1: Compare lengths
        if (s1.length() != s2.length()) {
            isEqual = false;
        } else {
            // Step 2: Compare characters one by one
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        // Step 3: Output result
        if (isEqual) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        sc.close();
    }
}
