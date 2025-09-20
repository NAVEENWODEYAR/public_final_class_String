package com.string.code;

import java.util.EnumMap;
import java.util.Map;

/**
 * @author Naveen K Wodeyar
 * @date 19-Sept-2025
 */

public class DayTypeMapDemo {

 // Enum to represent days of the week
 enum Day {
     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 }

 public static void main(String[] args) {
     // Set today's day
     Day today = Day.WEDNESDAY;

     // Create a map to store the type of each day
     Map<Day, String> dayTypeMap = new EnumMap<>(Day.class);

     // Populate the map
     dayTypeMap.put(Day.MONDAY, "Weekday");
     dayTypeMap.put(Day.TUESDAY, "Weekday");
     dayTypeMap.put(Day.WEDNESDAY, "Midweek Day");
     dayTypeMap.put(Day.THURSDAY, "Weekday");
     dayTypeMap.put(Day.FRIDAY, "Weekday");
     dayTypeMap.put(Day.SATURDAY, "Weekend");
     dayTypeMap.put(Day.SUNDAY, "Weekend");

     // Get the type of the current day
     String typeOfDay = dayTypeMap.getOrDefault(today, "Unknown");

     // Display the result
     System.out.println("Today is a: " + typeOfDay);
 }
}

