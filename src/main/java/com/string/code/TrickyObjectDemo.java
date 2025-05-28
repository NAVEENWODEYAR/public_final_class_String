package com.string.code;

/**
 * @author Naveen K Wodeyar
 * @date 28-May-2025
 */

public class TrickyObjectDemo {

    static class Cup {
        String content;

        Cup(String content) {
            this.content = content;
        }

        void fill(String newContent) {
            this.content = newContent;
        }

        @Override
        public String toString() {
            return "Cup with " + content;
        }
    }

    public static void main(String[] args) {
        final Cup cup1 = new Cup("Coffee");
        Cup cup2 = cup1;  // cup2 points to the same object

        Cup cup3 = new Cup("Coffee"); // new object with same content

        System.out.println("cup1 == cup2: " + (cup1 == cup2));           // true
        System.out.println("cup1 == cup3: " + (cup1 == cup3));           // false
        System.out.println("cup1.content.equals(cup3.content): " + cup1.content.equals(cup3.content)); // true

        // Change content of cup1
        cup1.fill("Tea");

        System.out.println("After filling cup1:");
        System.out.println("cup1: " + cup1);  // Tea
        System.out.println("cup2: " + cup2);  // Tea
        System.out.println("cup3: " + cup3);  // Coffee

        // Even though cup1 is final, we mutated its state!
        System.out.println("Mutating final object reference worked!");

        // Now the twist
        cup2 = new Cup("Juice");  // cup2 now points to a new object

        System.out.println("After changing cup2 reference:");
        System.out.println("cup1: " + cup1);  // Tea
        System.out.println("cup2: " + cup2);  // Juice

        // Bonus trick: null + equals
        try {
            System.out.println("null.equals(\"Test\") = " + ((Object) null).equals("Test"));
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException from null.equals()");
        }
    }
}
