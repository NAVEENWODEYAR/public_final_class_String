package com.string;

/**
 * @author Naveen K Wodeyar
 * @date 07-Feb-2026
 */

public class FinallyReturnTest {

    public static void main(String[] args) {
        System.out.println(getValue());
    }

    @SuppressWarnings("finally")
	static int getValue() {
        try {
            return 10;
        } finally {
            System.out.println("Finaly always executes,,,,,,,");
            return 20;
        }
    }
}
