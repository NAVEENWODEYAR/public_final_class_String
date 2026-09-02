/**
 * @author Naveen K Wodeyar
 * @date 02-Sept-2026
 */
package com.string.code.realWorld;

/**
 * ============================================================
 * Program Name : TimeSpaceComplexity
 * ============================================================
 *
 * Description:
 * This program explains Time Complexity and Space Complexity
 * using simple Java examples.
 *
 * ------------------------------------------------------------
 * TIME COMPLEXITY
 * ------------------------------------------------------------
 * Time Complexity tells us how the number of operations in
 * an algorithm increases when the input size increases.
 *
 * ------------------------------------------------------------
 * SPACE COMPLEXITY
 * ------------------------------------------------------------
 * Space Complexity tells us how much additional memory an
 * algorithm requires when the input size increases.
 *
 * ------------------------------------------------------------
 * BIG-O NOTATION
 * ------------------------------------------------------------
 * Big-O notation is used to describe the efficiency of an
 * algorithm.
 *
 * Common Big-O complexities:
 *
 * O(1)       -> Constant Time
 * O(log n)   -> Logarithmic Time
 * O(n)       -> Linear Time
 * O(n log n) -> Linearithmic Time
 * O(n²)      -> Quadratic Time
 *
 * ------------------------------------------------------------
 * REAL-WORLD EXAMPLES
 * ------------------------------------------------------------
 *
 * O(1)
 * -> Accessing an element using an array index.
 *
 * O(log n)
 * -> Searching sorted data using Binary Search.
 *
 * O(n)
 * -> Checking every product in a product list.
 *
 * O(n²)
 * -> Comparing every student with every other student.
 *
 * O(n) Space
 * -> Creating a new array to store copied data.
 *
 * ============================================================
 */
public class TimeSpaceComplexityDemo {

    /**
     * --------------------------------------------------------
     * Example 1: O(1) - Constant Time
     * --------------------------------------------------------
     *
     * This method accesses only one element from the array.
     *
     * It does not matter whether the array contains:
     *
     * 5 elements
     * 100 elements
     * 1,000,000 elements
     *
     * We still access only one element.
     *
     * Time Complexity  : O(1)
     * Space Complexity : O(1)
     *
     * Real-world example:
     * Accessing a product using its known array position.
     *
     * @param numbers input array
     */
    public static void constantTime(int[] numbers) {

        // Direct access using index.
        System.out.println("First element: " + numbers[0]);
    }


    /**
     * --------------------------------------------------------
     * Example 2: O(n) - Linear Time
     * --------------------------------------------------------
     *
     * This method visits every element of the array once.
     *
     * If there are n elements, the loop runs n times.
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     *
     * Real-world example:
     * Displaying all products in an online shopping application.
     *
     * @param numbers input array
     */
    public static void linearTime(int[] numbers) {

        // Loop runs once for every element.
        for (int i = 0; i < numbers.length; i++) {

            System.out.println(numbers[i]);
        }
    }


    /**
     * --------------------------------------------------------
     * Example 3: O(log n) - Logarithmic Time
     * --------------------------------------------------------
     *
     * This method uses Binary Search.
     *
     * Binary Search works only when the array is sorted.
     *
     * Instead of checking every element, it checks the
     * middle element and eliminates half of the search area.
     *
     * Example:
     *
     * 10 20 30 40 50 60 70 80
     *
     * Search for 70.
     *
     * The algorithm keeps dividing the search area into half.
     *
     * Time Complexity  : O(log n)
     * Space Complexity : O(1)
     *
     * Real-world example:
     * Searching for an employee ID in sorted employee data.
     *
     * @param numbers sorted array
     * @param target value to search
     * @return true if target exists, otherwise false
     */
    public static boolean binarySearch(int[] numbers, int target) {

        int left = 0;
        int right = numbers.length - 1;

        // Continue while a valid search range exists.
        while (left <= right) {

            // Find the middle element.
            int middle = left + (right - left) / 2;

            // Target found.
            if (numbers[middle] == target) {
                return true;
            }

            // Target is greater than middle.
            if (numbers[middle] < target) {

                // Ignore the left half.
                left = middle + 1;
            }

            // Target is smaller than middle.
            else {

                // Ignore the right half.
                right = middle - 1;
            }
        }

        // Target was not found.
        return false;
    }


    /**
     * --------------------------------------------------------
     * Example 4: O(n²) - Quadratic Time
     * --------------------------------------------------------
     *
     * This method compares every element with every other
     * element.
     *
     * There are two nested loops.
     *
     * Outer loop -> n times
     * Inner loop -> n times
     *
     * Total operations:
     *
     * n * n = n²
     *
     * Time Complexity  : O(n²)
     * Space Complexity : O(1)
     *
     * Real-world example:
     * Comparing every student with every other student.
     *
     * @param numbers input array
     */
    public static void quadraticTime(int[] numbers) {

        // First loop.
        for (int i = 0; i < numbers.length; i++) {

            // Second loop.
            for (int j = i + 1; j < numbers.length; j++) {

                System.out.println(
                        numbers[i] + " and " + numbers[j]
                );
            }
        }
    }


    /**
     * --------------------------------------------------------
     * Example 5: O(n) Time and O(n) Space
     * --------------------------------------------------------
     *
     * This method creates a new array and copies all elements
     * from the original array.
     *
     * If the original array contains n elements, the new
     * array also contains n elements.
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(n)
     *
     * Real-world example:
     * Creating a backup copy of data before modifying it.
     *
     * @param numbers input array
     * @return copied array
     */
    public static int[] createCopy(int[] numbers) {

        // Create an additional array.
        int[] copy = new int[numbers.length];

        // Copy every element.
        for (int i = 0; i < numbers.length; i++) {

            copy[i] = numbers[i];
        }

        return copy;
    }


    /**
     * --------------------------------------------------------
     * Main Method
     * --------------------------------------------------------
     *
     * The main method executes all examples.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        /*
         * Create an input array.
         *
         * The array is sorted so that we can use
         * Binary Search.
         */
        int[] numbers = {10, 20, 30, 40, 50};


        // ====================================================
        // O(1) - CONSTANT TIME
        // ====================================================

        System.out.println();
        System.out.println("======================================");
        System.out.println("1. O(1) - CONSTANT TIME");
        System.out.println("======================================");

        constantTime(numbers);


        // ====================================================
        // O(n) - LINEAR TIME
        // ====================================================

        System.out.println();
        System.out.println("======================================");
        System.out.println("2. O(n) - LINEAR TIME");
        System.out.println("======================================");

        linearTime(numbers);


        // ====================================================
        // O(log n) - LOGARITHMIC TIME
        // ====================================================

        System.out.println();
        System.out.println("======================================");
        System.out.println("3. O(log n) - LOGARITHMIC TIME");
        System.out.println("======================================");

        int target = 30;

        boolean found = binarySearch(numbers, target);

        if (found) {
            System.out.println(
                    target + " was found in the array."
            );
        } else {
            System.out.println(
                    target + " was not found in the array."
            );
        }


        // ====================================================
        // O(n²) - QUADRATIC TIME
        // ====================================================

        System.out.println();
        System.out.println("======================================");
        System.out.println("4. O(n²) - QUADRATIC TIME");
        System.out.println("======================================");

        quadraticTime(numbers);


        // ====================================================
        // O(n) TIME + O(n) SPACE
        // ====================================================

        System.out.println();
        System.out.println("======================================");
        System.out.println("5. O(n) TIME + O(n) SPACE");
        System.out.println("======================================");

        int[] copiedArray = createCopy(numbers);

        System.out.println("Copied Array:");

        for (int number : copiedArray) {
            System.out.println(number);
        }


        // ====================================================
        // FINAL SUMMARY
        // ====================================================

        System.out.println();
        System.out.println("======================================");
        System.out.println("FINAL COMPLEXITY SUMMARY");
        System.out.println("======================================");

        System.out.println(
                "constantTime()  -> Time: O(1),     Space: O(1)"
        );

        System.out.println(
                "linearTime()    -> Time: O(n),     Space: O(1)"
        );

        System.out.println(
                "binarySearch()  -> Time: O(log n), Space: O(1)"
        );

        System.out.println(
                "quadraticTime() -> Time: O(n²),    Space: O(1)"
        );

        System.out.println(
                "createCopy()    -> Time: O(n),     Space: O(n)"
        );

        System.out.println();
        System.out.println("Program completed successfully.");
    }
}
