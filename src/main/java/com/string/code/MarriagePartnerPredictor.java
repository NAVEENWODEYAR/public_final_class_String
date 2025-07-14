package com.string.code;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 13-Jul-2025
 */

public class MarriagePartnerPredictor {

    private static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Input section
            System.out.print("Enter your full name: ");
            String name = scanner.nextLine().trim();

            LocalDate dob = readDateOfBirth(scanner);

            // Process section
            int birthDay = dob.getDayOfMonth();
            String zodiacSign = getZodiacSign(birthDay, dob.getMonthValue());
            int birthNumber = birthDay % 9 == 0 ? 9 : birthDay % 9; // Simple numerology

            // Output section
            System.out.println("\n=== Personality & Match Analysis ===");
            System.out.println("Name: " + name);
            System.out.println("DOB : " + dob.format(DATE_FORMAT));
            System.out.println("Zodiac Sign: " + zodiacSign);
            System.out.println("Birth Number (Numerology): " + birthNumber);
            System.out.println("Personality Traits: " + getPersonalityTraits(zodiacSign));
            System.out.println("Ideal Partner Match: " + getPartnerPreference(zodiacSign));
            System.out.println("Name Compatibility Insight: " + getNameCompatibility(name));
        } catch (InvalidInputException e) {
            System.err.println("Input Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static LocalDate readDateOfBirth(Scanner scanner) throws InvalidInputException {
        System.out.print("Enter your date of birth (yyyy-MM-dd): ");
        String input = scanner.nextLine().trim();

        try {
            LocalDate dob = LocalDate.parse(input, DATE_FORMAT);
            if (dob.isAfter(LocalDate.now())) {
                throw new InvalidInputException("DOB cannot be in the future.");
            }
            return dob;
        } catch (DateTimeParseException e) {
            throw new InvalidInputException("Invalid date format. Use yyyy-MM-dd.");
        }
    }

    private static String getZodiacSign(int day, int month) {
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Aquarius";
        else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) return "Pisces";
        else if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Taurus";
        else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Gemini";
        else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer";
        else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Scorpio";
        else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagittarius";
        else return "Capricorn";
    }

    private static String getPersonalityTraits(String zodiac) {
        return switch (zodiac) {
            case "Aries"       -> "Bold, ambitious, competitive.";
            case "Taurus"      -> "Reliable, patient, romantic.";
            case "Gemini"      -> "Intellectual, curious, sociable.";
            case "Cancer"      -> "Emotional, caring, intuitive.";
            case "Leo"         -> "Confident, charismatic, creative.";
            case "Virgo"       -> "Analytical, practical, modest.";
            case "Libra"       -> "Charming, diplomatic, balanced.";
            case "Scorpio"     -> "Mysterious, passionate, focused.";
            case "Sagittarius" -> "Adventurous, independent, honest.";
            case "Capricorn"   -> "Disciplined, ambitious, loyal.";
            case "Aquarius"    -> "Innovative, quirky, visionary.";
            case "Pisces"      -> "Empathetic, dreamy, spiritual.";
            default            -> "Unique personality.";
        };
    }

    private static String getPartnerPreference(String zodiac) {
        return switch (zodiac) {
            case "Aries"       -> "Leo or Sagittarius";
            case "Taurus"      -> "Virgo or Capricorn";
            case "Gemini"      -> "Libra or Aquarius";
            case "Cancer"      -> "Scorpio or Pisces";
            case "Leo"         -> "Aries or Sagittarius";
            case "Virgo"       -> "Taurus or Capricorn";
            case "Libra"       -> "Gemini or Aquarius";
            case "Scorpio"     -> "Cancer or Pisces";
            case "Sagittarius" -> "Aries or Leo";
            case "Capricorn"   -> "Taurus or Virgo";
            case "Aquarius"    -> "Gemini or Libra";
            case "Pisces"      -> "Cancer or Scorpio";
            default            -> "Unknown match";
        };
    }

    private static String getNameCompatibility(String name) {
        if (name == null || name.isEmpty()) return "Unknown";

        char firstChar = Character.toUpperCase(name.charAt(0));
        if ("AEIOU".indexOf(firstChar) != -1) {
            return "Strong emotional connection likely.";
        } else if ("MNRTLS".indexOf(firstChar) != -1) {
            return "You value stability and commitment.";
        } else {
            return "You might prefer intellectual or creative partners.";
        }
    }

    // Custom exception class
    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }
}
