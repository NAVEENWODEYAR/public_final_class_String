package com.string.err;

/**
 * Demonstrates how to prevent {@link StackOverflowError} in recursive Java methods.
 *
 * <p>{@code StackOverflowError} is an unchecked JVM {@link Error} thrown when the depth of
 * method calls exceeds the current thread's call stack limit (configurable via {@code -Xss}).
 * It commonly occurs due to missing or unreachable base cases in recursion, cyclic calls,
 * or excessively deep call chains.</p>
 *
 * <p>Rather than catching {@code StackOverflowError} to recover, callers should enforce a
 * clear termination condition, validate inputs, and use iteration or an explicit heap-based
 * stack when traversal depth can grow very large.</p>
 *
 * @author Naveen K Wodeyar
 * @date 19-Nov-2026
 */
public class StackOverflowRealWorld {

    private static final int MAX_DEPTH = 10; // Safe stop condition for recursion

    /**
     * Entry point that runs a bounded recursive bin inspection without exhausting the call stack.
     *
     * @param args command-line arguments (unused)
     */
    public static void main(String[] args) {
        System.out.println("Inspecting nested warehouse bins...");

        // Safe bounded recursion with a clear base case
        inspectBin(1, MAX_DEPTH);
    }

    /**
     * Recursively inspects nested bins from {@code currentLevel} up to {@code maxLevel}.
     *
     * <p>Stops once {@code currentLevel} exceeds {@code maxLevel}, preventing the infinite
     * call-stack growth that causes {@link StackOverflowError}.</p>
     *
     * @param currentLevel the current 1-based nesting depth being inspected
     * @param maxLevel     the maximum allowed nesting depth before unwinding the stack
     * @throws IllegalArgumentException if {@code maxLevel} is negative
     */
    private static void inspectBin(int currentLevel, int maxLevel) {
        if (maxLevel < 0) {
            throw new IllegalArgumentException("maxLevel must not be negative: " + maxLevel);
        }

        // 1. Base case: stops recursion once the target depth is reached
        if (currentLevel > maxLevel) {
            System.out.println("Reached bottom bin at level " + maxLevel + ". Unwinding stack.");
            return;
        }

        // 2. Work done at the current stack frame
        System.out.println("Checking bin level: " + currentLevel);

        // 3. Progress toward base case (incrementing level prevents infinite recursion)
        inspectBin(currentLevel + 1, maxLevel);
    }
}