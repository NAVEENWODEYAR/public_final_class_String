package com.string.code.realWorld;

import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 30-Dec-2025
 */

public class FindDay {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter birth year (yyyy): ");
        int year = sc.nextInt();

        System.out.print("Enter birth month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter birday (1-31): ");
        int day = sc.nextInt();

        // Create date
        LocalDate date = LocalDate.of(year, month, day);

        // Get day of week
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        System.out.println("Day is: " + dayOfWeek);

        sc.close();
    }
}
