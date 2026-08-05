package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 13-Feb-2026
 */

public class AllSubstrings {

    // Method to print all substrings
    public static void printAllSubstrings(String str) {
        System.out.println("Input: \"" + str + "\"");
        System.out.println("Output:");

        if (str == null) {
            System.out.println("Invalid Input (null)");
            return;
        }

        if (str.isEmpty()) {
            System.out.println("No substrings (Empty String)");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.println(str.substring(i, j));
            }
        }

        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {

        // LeetCode Style Test Case 1
        System.out.println("Test Case 1");
        printAllSubstrings("abc");

        /*
        Expected Output:
        a
        ab
        abc
        b
        bc
        c
        */

        // LeetCode Style Test Case 2
        System.out.println("Test Case 2");
        printAllSubstrings("abcd");

        /*
        Expected Output:
        a
        ab
        abc
        abcd
        b
        bc
        bcd
        c
        cd
        d
        */

        // LeetCode Style Test Case 3
        System.out.println("Test Case 3");
        printAllSubstrings("aaa");

        /*
        Expected Output:
        a
        aa
        aaa
        a
        aa
        a
        */

        // LeetCode Style Test Case 4
        System.out.println("Test Case 4");
        printAllSubstrings("a");

        /*
        Expected Output:
        a
        */

        // LeetCode Style Test Case 5
        System.out.println("Test Case 5");
        printAllSubstrings("");

        /*
        Expected Output:
        No substrings (Empty String)
        */

        // LeetCode Style Test Case 6
        System.out.println("Test Case 6");
        printAllSubstrings("race");

        /*
        Expected Output:
        r
        ra
        rac
        race
        a
        ac
        ace
        c
        ce
        e
        */

        // LeetCode Style Test Case 7
        System.out.println("Test Case 7");
        printAllSubstrings(null);

        /*
        Expected Output:
        Invalid Input (null)
        */
    }
}