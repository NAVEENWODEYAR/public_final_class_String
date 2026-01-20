package com.string.exptn;

/**
 * @author Naveen K Wodeyar
 * @date 20-Jan-2026
 */

class ExceptionPropagationDemo {

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println("Exception caught in main()");
            e.printStackTrace();
        }
    }

    static void methodA() throws Exception {
        methodB();
    }

    static void methodB() throws Exception {
        methodC();
    }

    static void methodC() throws Exception {
        try {
            int result = 10 / 0; // causes ArithmeticException
        } catch (Exception e) {
            // Capture exact method where exception occurred
            String methodName = Thread.currentThread()
                                      .getStackTrace()[1]
                                      .getMethodName();

            // Wrap and rethrow with method name
            throw new Exception(
                "Exception occurred in method: " + methodName,
                e // preserve original exception
            );
        }
    }
}
