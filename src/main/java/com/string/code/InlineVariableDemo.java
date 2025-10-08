/**
 * @author Naveen K Wodeyar
 * @date 08-Oct-2025
 */
package com.string.code;

public class InlineVariableDemo {
    public static void main(String[] args) {

        // 👇 Regular Variable Declaration
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum using regular variables: " + sum);

        // 👇 Inline Variable (used directly in the expression)
        System.out.println("Sum using inline variables: " + (10 + 20));

        // 👇 Another example with method call
        int max1 = Math.max(a, b);  // regular variables
        System.out.println("Max using regular variables: " + max1);

        // Inline usage
        System.out.println("Max using inline values: " + Math.max(10, 20));

        // 👇 With String concatenation
        String name = "Alice";
        int age = 25;
        System.out.println("Using regular variables: Name = " + name + ", Age = " + age);

        // Inline way
        System.out.println("Using inline values: Name = " + "Alice" + ", Age = " + 25);
    }
}
