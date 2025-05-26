package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 26-May-2025
 */

public class ConcatenatedString {
 public static void main(String[] args) {
     int n = 3;
     String result = "";
     for (int i = 1; i <= n; i++) {
         char ch = 'A';
         for (int j = 1; j <= i; j++) {
             result += ch++;
         }
         result += " ";
     }
     System.out.println(result.trim()); // Output: A AB ABC
 }
}
