package com.string.series;

/**
 * @author Naveen K Wodeyar
 * @date 26-May-2025
 */

public class NumberToCharSeries {
 public static void main(String[] args) {
     int[] nums = {1, 2, 3, 26};
     for (int n : nums) {
         System.out.print((char) (n + 64) + " ");
     }
     // Output: A B C Z
 }
}
