package com.string.code;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;

/**
 * @author Naveen K Wodeyar
* @date 01-Jul-2025
*/

public class DayFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter date
        System.out.print("Enter date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();

        try {
            // Parse the input date
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date = LocalDate.parse(inputDate, formatter);

            // Get the day of the week
            DayOfWeek dayOfWeek = date.getDayOfWeek();

            // Display the result
            System.out.println("Day of the week is: " + dayOfWeek);

        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }

        scanner.close();
    }
}
