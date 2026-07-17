package com.string.code.realWorld;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Program to find the day of the week for a given date.
 *
 * Author : Naveen K Wodeyar
 * Date   : 30-Dec-2025
 */
public class FindDay {

    /**
     * Returns the day of the week for the given date.
     *
     * @param year  Year (e.g., 2025)
     * @param month Month (1-12)
     * @param day   Day of the month (1-31)
     * @return Day of the week as a String
     */
    public static String findDay(int year, int month, int day) {
        LocalDate date = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        return dayOfWeek.toString();
    }

    public static void main(String[] args) {

        // Test cases in the format:
        // {year, month, day, expectedDay}
        Object[][] testCases = {
                {2025, 12, 30, "TUESDAY"},
                {2000, 1, 1, "SATURDAY"},
                {1995, 8, 15, "TUESDAY"},
                {2024, 2, 29, "THURSDAY"},
                {2023, 1, 1, "SUNDAY"},
                {2022, 10, 2, "SUNDAY"},
                {2010, 7, 4, "SUNDAY"},
                {1990, 12, 25, "TUESDAY"}
        };

        int passed = 0;

        // Execute each test case
        for (int i = 0; i < testCases.length; i++) {

            // Read test case values
            int year = (int) testCases[i][0];
            int month = (int) testCases[i][1];
            int day = (int) testCases[i][2];
            String expected = (String) testCases[i][3];

            // Get the actual result
            String actual = findDay(year, month, day);

            // Compare expected and actual results
            if (actual.equals(expected)) {
                System.out.println("✅ Test Case " + (i + 1) + " PASSED");
                passed++;
            } else {
                System.out.println("❌ Test Case " + (i + 1) + " FAILED");
                System.out.println("Input    : (" + year + ", " + month + ", " + day + ")");
                System.out.println("Expected : " + expected);
                System.out.println("Actual   : " + actual);
            }
        }

        // Display the final summary
        System.out.println("\n--------------------------------");
        System.out.println("Passed " + passed + " out of " + testCases.length + " test cases.");
        System.out.println("--------------------------------");
    }
}