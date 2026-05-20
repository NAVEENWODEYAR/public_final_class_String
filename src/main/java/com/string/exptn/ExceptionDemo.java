/**
 * @author Naveen K Wodeyar
 * @date 21-May-2026
 */
package com.string.exptn;

public class ExceptionDemo {

    public static void main(String[] args) {

        System.out.println("====== EXCEPTION DEMO ======\n");

        // ======================================================
        // 1. NEGATIVE ARRAY SIZE EXCEPTION
        // ======================================================

        try {

            System.out.println("1. NegativeArraySizeException Example");

            int size = -5;

            // Creating array with negative size
            int[] numbers = new int[size];

        } catch (NegativeArraySizeException e) {

            System.out.println("Exception Caught:");
            System.out.println(e);

        }

        System.out.println();

        // ======================================================
        // 2. ARRAY INDEX OUT OF BOUNDS EXCEPTION
        // ======================================================

        try {

            System.out.println("2. ArrayIndexOutOfBoundsException Example");

            int[] arr = {10, 20, 30};

            // Valid indexes: 0, 1, 2
            // Accessing invalid index 5
            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Exception Caught:");
            System.out.println(e);

        }

        System.out.println();

        // ======================================================
        // 3. STRING INDEX OUT OF BOUNDS EXCEPTION
        // ======================================================

        try {

            System.out.println("3. StringIndexOutOfBoundsException Example");

            String name = "Java";

            // Valid indexes: 0 to 3
            // Accessing invalid index 10
            System.out.println(name.charAt(10));

        } catch (StringIndexOutOfBoundsException e) {

            System.out.println("Exception Caught:");
            System.out.println(e);

        }

        System.out.println();

        // ======================================================
        // 4. HANDLING MULTIPLE EXCEPTIONS
        // ======================================================

        try {

            System.out.println("4. Multiple Exception Handling");

            int[] data = new int[-1];

            System.out.println(data[10]);

        } catch (NegativeArraySizeException e) {

            System.out.println("NegativeArraySizeException Handled");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("ArrayIndexOutOfBoundsException Handled");

        }

        System.out.println("\n====== PROGRAM COMPLETED ======");
    }
}