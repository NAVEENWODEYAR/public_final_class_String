package com.string.exptn;

/**
 * @author Naveen K Wodeyar
 * @date 21-May-2026
 */

public class InfinityDemo {

    public static void main(String[] args) {

        System.out.println("====== INFINITY IN JAVA ======\n");

        // ======================================================
        // 1. POSITIVE INFINITY
        // ======================================================

        double positiveInfinity = 10.0 / 0.0;

        System.out.println("Positive Infinity:");
        System.out.println("10.0 / 0.0 = " + positiveInfinity);

        // Check if value is infinite
        System.out.println("Is Infinite? " +
                Double.isInfinite(positiveInfinity));

        System.out.println();

        // ======================================================
        // 2. NEGATIVE INFINITY
        // ======================================================

        double negativeInfinity = -10.0 / 0.0;

        System.out.println("Negative Infinity:");
        System.out.println("-10.0 / 0.0 = " + negativeInfinity);

        System.out.println("Is Infinite? " +
                Double.isInfinite(negativeInfinity));

        System.out.println();

        // ======================================================
        // 3. NaN (Not a Number)
        // ======================================================

        double nanValue = 0.0 / 0.0;

        System.out.println("NaN Example:");
        System.out.println("0.0 / 0.0 = " + nanValue);

        // Check NaN
        System.out.println("Is NaN? " +
                Double.isNaN(nanValue));

        System.out.println();

        // ======================================================
        // 4. LOOP DEMONSTRATION
        // ======================================================

        System.out.println("Infinite Loop Example:");

        int count = 0;

        // Infinite loop using true condition
        while (true) {

            System.out.println("Loop Running: " + count);

            count++;

            // Break condition added to avoid endless execution
            if (count == 5) {
                System.out.println("Breaking Infinite Loop...");
                break;
            }
        }

        System.out.println("\n====== END OF PROGRAM ======");
    }
}