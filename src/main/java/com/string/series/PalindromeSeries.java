package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 26-May-2025
 */

public class PalindromeSeries {
 public static void main(String[] args) {
     int n = 5;
     char c = 'a';
     for (int i = 0; i < n; i++) {
         String s = c + "" + c;
         System.out.println(s); // aa, bb, cc, ...
         c++;
     }
 }
}
