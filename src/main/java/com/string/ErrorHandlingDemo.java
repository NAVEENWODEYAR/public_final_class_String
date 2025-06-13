package com.string;

/**
 * @author Naveen K Wodeyar
 * @date 13-Jun-2025
 */

public class ErrorHandlingDemo {

    // Cause StackOverflowError by infinite recursion
    public void causeStackOverflowError() {
        causeStackOverflowError();
    }

    // Cause OutOfMemoryError by allocating huge array
    public void causeOutOfMemoryError() {
        int[] hugeArray = new int[Integer.MAX_VALUE];
    }

    // Cause NoClassDefFoundError by trying to load a non-existing class
    public void causeNoClassDefFoundError() throws ClassNotFoundException {
        Class.forName("non.existing.ClassName");
    }
    
    // Safe wrappers that catch errors and return messages
    public String safeStackOverflow() {
        try {
            causeStackOverflowError();
        } catch (StackOverflowError e) {
            return "Caught StackOverflowError";
        }
        return "No Error";
    }

    public String safeOutOfMemory() {
        try {
            causeOutOfMemoryError();
        } catch (OutOfMemoryError e) {
            return "Caught OutOfMemoryError";
        }
        return "No Error";
    }

    public String safeNoClassDefFound() {
        try {
            causeNoClassDefFoundError();
        } catch (NoClassDefFoundError e) {
            return "Caught NoClassDefFoundError";
        } catch (ClassNotFoundException e) {
            // ClassNotFoundException is checked, handle here for completeness
            return "Caught ClassNotFoundException";
        }
        return "No Error";
    }
}
