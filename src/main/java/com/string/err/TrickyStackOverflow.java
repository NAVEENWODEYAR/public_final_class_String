/**
 * @author Naveen K Wodeyar
 * @date 16-Jul-2025
 */
package com.string.err;

public class TrickyStackOverflow {

    TrickyStackOverflow selfReference;

    @Override
    public String toString() {
        return "Object: " + selfReference; // Causes infinite recursion!
    }

    public static void main(String[] args) {
        TrickyStackOverflow obj = new TrickyStackOverflow();
        obj.selfReference = obj;

        System.out.println(obj); // 💥 StackOverflowError!
    }
}
