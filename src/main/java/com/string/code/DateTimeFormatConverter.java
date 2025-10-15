/**
 * @author Naveen K Wodeyar
 * @date 15-Oct-2025
 */
package com.string.code;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;
import java.util.Locale;

public class DateTimeFormatConverter {

    public static void main(String[] args) {
        // Input date-time string and format
        String inputDateTime = "2025-10-15 14:30:00";
        String inputFormat = "yyyy-MM-dd HH:mm:ss";

        // Parse input string to LocalDateTime
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern(inputFormat);
        LocalDateTime dateTime = LocalDateTime.parse(inputDateTime, inputFormatter);

        // Convert to ZonedDateTime (optional, for timezone-based formats)
        ZonedDateTime zonedDateTime = dateTime.atZone(ZoneId.systemDefault());

        // Output in various formats
        System.out.println("Original:               " + inputDateTime);
        System.out.println("ISO_LOCAL_DATE:         " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE));
        System.out.println("ISO_LOCAL_DATE_TIME:    " + dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("ISO_ZONED_DATE_TIME:    " + zonedDateTime.format(DateTimeFormatter.ISO_ZONED_DATE_TIME));
        System.out.println("RFC_1123_DATE_TIME:     " + zonedDateTime.format(DateTimeFormatter.RFC_1123_DATE_TIME));
        System.out.println("Basic ISO Date:         " + dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
        System.out.println("Custom (US):            " + dateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a")));
        System.out.println("Custom (EU):            " + dateTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
        System.out.println("Custom (Full):          " + dateTime.format(DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy HH:mm:ss", Locale.ENGLISH)));
        System.out.println("Epoch timestamp:        " + zonedDateTime.toEpochSecond());
    }
}
