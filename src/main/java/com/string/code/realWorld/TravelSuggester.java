package com.string.code.realWorld;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 16-Aug-2025
 */

public class TravelSuggester {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Travel Suggester!");
        System.out.print("Enter the current month (1-12): ");
        
        int month = scanner.nextInt();
        suggestDestinations(month);
        
        scanner.close();
    }

    public static void suggestDestinations(int month) {
        System.out.println("\nBased on the month, here are some travel suggestions:");

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("- Bali, Indonesia (warm and tropical)");
                System.out.println("- Switzerland (skiing and winter sports)");
                System.out.println("- Dubai, UAE (pleasant desert weather)");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("- Japan (cherry blossom season)");
                System.out.println("- Morocco (comfortable spring weather)");
                System.out.println("- Spain (mild and sunny)");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("- Iceland (midnight sun and nature tours)");
                System.out.println("- Canada (great for outdoor adventures)");
                System.out.println("- Greece (perfect Mediterranean summer)");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("- New England, USA (fall foliage)");
                System.out.println("- South Africa (safari season)");
                System.out.println("- Italy (less crowded, still warm)");
                break;

            default:
                System.out.println("Invalid month. Please enter a value between 1 and 12.");
        }
    }
}
