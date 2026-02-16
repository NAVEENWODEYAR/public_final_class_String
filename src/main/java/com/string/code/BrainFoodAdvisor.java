package com.string.code;

import java.util.*;

/**
 * @author Naveen K Wodeyar
 * @date 14-Feb-2026
 */

public class BrainFoodAdvisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Brain Food Advisor ===");
        System.out.println("Select your goal:");
        System.out.println("1. Improve Memory");
        System.out.println("2. Increase Focus");
        System.out.println("3. Boost Mood");
        System.out.println("4. Overall Brain Health");
        System.out.print("Enter choice (1-4): ");

        int choice = scanner.nextInt();

        System.out.println("\nRecommended Foods:\n");

        switch (choice) {
            case 1:
                suggestMemoryFoods();
                break;
            case 2:
                suggestFocusFoods();
                break;
            case 3:
                suggestMoodFoods();
                break;
            case 4:
                suggestOverallBrainFoods();
                break;
            default:
                System.out.println("Invalid choice. Please restart and select between 1-4.");
        }

        scanner.close();
    }

    public static void suggestMemoryFoods() {
        System.out.println("- Blueberries (rich in antioxidants)");
        System.out.println("- Fatty fish (like salmon)");
        System.out.println("- Turmeric");
        System.out.println("- Pumpkin seeds");
        System.out.println("- Broccoli");
    }

    public static void suggestFocusFoods() {
        System.out.println("- Coffee (caffeine improves alertness)");
        System.out.println("- Dark chocolate");
        System.out.println("- Green tea");
        System.out.println("- Nuts (especially walnuts)");
        System.out.println("- Eggs");
    }

    public static void suggestMoodFoods() {
        System.out.println("- Bananas");
        System.out.println("- Oats");
        System.out.println("- Yogurt");
        System.out.println("- Berries");
        System.out.println("- Leafy greens");
    }

    public static void suggestOverallBrainFoods() {
        System.out.println("- Salmon");
        System.out.println("- Blueberries");
        System.out.println("- Turmeric");
        System.out.println("- Walnuts");
        System.out.println("- Oranges");
    }
}
