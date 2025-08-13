package com.string.code.realWorld;

import java.util.Scanner;

/**
 * @author Naveen K Wodeyar
 * @date 13-Aug-2025
 */

public class BehaviorSuggestionProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("=== Behavior Suggestion Program ===");

        do {
            System.out.println("\nChoose a situation:");
            System.out.println("1. Handling pressure");
            System.out.println("2. Being scolded");
            System.out.println("3. Facing criticism");
            System.out.println("4. Dealing with failure");
            System.out.println("5. Conflict with a peer");
            System.out.println("6. Public speaking anxiety");
            System.out.println("7. Feeling overwhelmed");
            System.out.println("8. Exit");

            System.out.print("Enter your choice (1-8): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n✅ Handling Pressure:");
                    System.out.println("- Prioritize tasks using a to-do list.");
                    System.out.println("- Take breaks and breathe deeply.");
                    System.out.println("- Tackle one task at a time.");
                    System.out.println("- Seek help when needed.");
                    break;

                case 2:
                    System.out.println("\n✅ Being Scolded:");
                    System.out.println("- Stay calm and listen actively.");
                    System.out.println("- Avoid reacting defensively.");
                    System.out.println("- Reflect on what was said.");
                    System.out.println("- Apologize if necessary and take action.");
                    break;

                case 3:
                    System.out.println("\n✅ Facing Criticism:");
                    System.out.println("- Accept it as a chance to grow.");
                    System.out.println("- Clarify the feedback if needed.");
                    System.out.println("- Don’t take it personally.");
                    System.out.println("- Say 'thank you' and work on it.");
                    break;

                case 4:
                    System.out.println("\n✅ Dealing with Failure:");
                    System.out.println("- Learn from mistakes.");
                    System.out.println("- Analyze what went wrong.");
                    System.out.println("- Stay positive and resilient.");
                    System.out.println("- Try again with improvements.");
                    break;

                case 5:
                    System.out.println("\n✅ Conflict with a Peer:");
                    System.out.println("- Stay respectful and calm.");
                    System.out.println("- Listen to understand, not just respond.");
                    System.out.println("- Communicate clearly and assertively.");
                    System.out.println("- Find a compromise or resolution.");
                    break;

                case 6:
                    System.out.println("\n✅ Public Speaking Anxiety:");
                    System.out.println("- Practice thoroughly beforehand.");
                    System.out.println("- Use breathing techniques to calm nerves.");
                    System.out.println("- Focus on your message, not fears.");
                    System.out.println("- Visualize success.");
                    break;

                case 7:
                    System.out.println("\n✅ Feeling Overwhelmed:");
                    System.out.println("- Pause and take deep breaths.");
                    System.out.println("- Break tasks into small steps.");
                    System.out.println("- Say no to additional tasks if needed.");
                    System.out.println("- Talk to someone or seek support.");
                    break;

                case 8:
                    System.out.println("Exiting program. Stay strong and take care!");
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please choose between 1 and 8.");
                    break;
            }

        } while (choice != 8);

        scanner.close();
    }
}
