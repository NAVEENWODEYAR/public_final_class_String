package com.string.code;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author Naveen K Wodeyar
 * @date 16-May-2025
 */

public class CityNameGenerator {
    public static void main(String[] args) {
        int cityCount = 10;     // number of city names to generate
        int nameLength = 7;     // length of each city name

        IntStream.range(0, cityCount).forEach(i -> {
            System.out.println("City " + (i + 1) + ": " + generateCityName(nameLength));
        });
    }

    // Method to generate a random city name
    public static String generateCityName(int length) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        StringBuilder name = new StringBuilder();

        // First letter uppercase
        name.append(Character.toUpperCase(alphabet.charAt(random.nextInt(26))));

        // Remaining letters lowercase
        for (int i = 1; i < length; i++) {
            name.append(alphabet.charAt(random.nextInt(26)));
        }

        return name.toString();
    }
}

