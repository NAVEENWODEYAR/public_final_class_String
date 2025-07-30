package com.string.code;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 30-Jul-2025
 */

public class LexicographicalSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read number of strings
        System.out.print("Enter the number of strings: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        String[] strings = new String[n];

        // Read strings
        System.out.println("Enter the strings:");
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort strings in lexicographical order
        Arrays.sort(strings);

        // Print sorted strings
        System.out.println("\nStrings in lexicographical order:");
        for (String str : strings) {
            System.out.println(str);
        }

        scanner.close();
    }
}
