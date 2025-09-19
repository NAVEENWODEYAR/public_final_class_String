package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 19-Sept-2025
 */


public class EnhancedSwitchDemo {

 // Enum to represent days of the week
 enum Day {
     MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
 }

 public static void main(String[] args) {
     Day today = Day.WEDNESDAY;

     // Use enhanced switch as an expression
     String typeOfDay = switch (today) {
         case MONDAY, TUESDAY, THURSDAY, FRIDAY -> "Weekday";

         case WEDNESDAY -> {
             System.out.println("It's midweek!");
             yield "Midweek Day";
         }

         case SATURDAY, SUNDAY -> "Weekend";
     };

     System.out.println("Today is a: " + typeOfDay);
 }
}
