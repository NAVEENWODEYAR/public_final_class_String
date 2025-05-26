package com.string.series;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Naveen K Wodeyar
 * @date 26-May-2025
 */

public class PalindromeSeries {

    public static List<String> generatePalindromeSeries(int n) {
        List<String> result = new ArrayList<>();
        char c = 'a';
        for (int i = 0; i < n; i++) {
            String s = c + "" + c;
            result.add(s);
            c++;
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> series = generatePalindromeSeries(5);
        for (String s : series) {
            System.out.println(s);
        }
    }
}
