package com.string.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Naveen K Wodeyar
 * @date 25-Jun-2025
 */

public class LoggingDemo {

    // Logger for the main class
    private static final Logger classLogger = LoggerFactory.getLogger(LoggingDemo.class);

    // Logger for a sub-package class
    private static final Logger childLogger = LoggerFactory.getLogger("com.example.sub");

    public static void main(String[] args) {

        System.out.println("Starting Logging Demo...\n");

        classLogger.trace("This is a TRACE message from classLogger");
        classLogger.debug("This is a DEBUG message from classLogger");
        classLogger.info("This is an INFO message from classLogger");
        classLogger.warn("This is a WARN message from classLogger");
        classLogger.error("This is an ERROR message from classLogger");

        System.out.println();

        childLogger.trace("This is a TRACE message from childLogger");
        childLogger.debug("This is a DEBUG message from childLogger");
        childLogger.info("This is an INFO message from childLogger");
        childLogger.warn("This is a WARN message from childLogger");
        childLogger.error("This is an ERROR message from childLogger");
    }
}
