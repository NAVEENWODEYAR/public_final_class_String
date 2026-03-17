/**
 * @author Naveen K Wodeyar
 * @date 12-Mar-2026
 */
package com.string.code;

public class LoopKeywordsDemo {

    public static void main(String[] args) {

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // continue: skip the iteration when i = 3
            if (i == 3) {
                // The loop will skip printing 3 and move to the next iteration
                System.out.println("Skipping number 3 using continue");
                continue;
            }

            // break: stop the loop completely when i = 6
            if (i == 6) {
                // The loop terminates here
                System.out.println("Stopping loop at 6 using break");
                break;
            }

            // return: exit the method completely when i = 8
            // (This will not run here because break already stops the loop at 6)
            if (i == 8) {
                System.out.println("Exiting program using return");
                return;
            }

            // This statement runs when none of the above conditions are met
            System.out.println("Current value of i: " + i);
        }

        // This line runs after the loop ends normally or by break
        System.out.println("Loop finished. Program continues after break.");
    }
}
