package com.string.code;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author Naveen K Wodeyar
 * @date 13-Jul-2025
 */

public class PartnerPreference {

    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            LocalDate dob = readDateOfBirth(scanner);
            String zodiacSign = getZodiacSign(dob.getDayOfMonth(), dob.getMonthValue());
            String partnerMatch = getPartnerPreference(zodiacSign);

            System.out.println("\n=== Result ===");
            System.out.println("Your Zodiac Sign: " + zodiacSign);
            System.out.println("Ideal Partner Match: " + partnerMatch);
        } catch (InvalidInputException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            // Catch any unexpected exception
            System.err.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close(); // Always close resources
        }
    }

    // Reads and parses the DOB input
    private static LocalDate readDateOfBirth(Scanner scanner) throws InvalidInputException {
        System.out.print("Enter your date of birth (yyyy-MM-dd): ");
        String input = scanner.nextLine().trim();

        try {
            LocalDate dob = LocalDate.parse(input, DATE_FORMATTER);
            if (dob.isAfter(LocalDate.now())) {
                throw new InvalidInputException("DOB cannot be in the future.");
            }
            return dob;
        } catch (Exception e) {
            throw new InvalidInputException("Invalid date format. Use yyyy-MM-dd.");
        }
    }

    // Determines zodiac sign based on day and month
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

    // Returns ideal partner matches based on zodiac sign
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
            default            -> "No match found";
        };
    }

    // Custom exception for user input errors
    static class InvalidInputException extends Exception {
        public InvalidInputException(String message) {
            super(message);
        }
    }
}
