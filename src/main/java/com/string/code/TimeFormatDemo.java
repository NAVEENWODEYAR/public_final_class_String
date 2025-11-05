package com.string.code;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author Naveen K Wodeyar
 * @date 05-Nov-2025
 */

public class TimeFormatDemo {

    public static void main(String[] args) {
        
        // --- OLD WAY (before Java 8) using SimpleDateFormat ---
        Date now = new Date();

        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mm a");            // 12-hour format with AM/PM
        SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");           // 24-hour format
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");// Full date & time
        SimpleDateFormat sdf4 = new SimpleDateFormat("E, MMM dd yyyy");     // Day, Month name, Year

        System.out.println("=== Using SimpleDateFormat (Old API) ===");
        System.out.println("12-hour format      : " + sdf1.format(now));
        System.out.println("24-hour format      : " + sdf2.format(now));
        System.out.println("Full date & time    : " + sdf3.format(now));
        System.out.println("Day-Month-Year      : " + sdf4.format(now));

        // --- NEW WAY (Java 8+) using java.time ---
        LocalDateTime current = LocalDateTime.now();

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh:mm a");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        System.out.println("\n=== Using DateTimeFormatter (Java 8+) ===");
        System.out.println("12-hour format      : " + current.format(dtf1));
        System.out.println("24-hour format      : " + current.format(dtf2));
        System.out.println("Full date & time    : " + current.format(dtf3));
        System.out.println("Verbose date format : " + current.format(dtf4));
    }
}
