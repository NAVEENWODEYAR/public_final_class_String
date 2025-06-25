package com.string.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Naveen K Wodeyar
 * @date 25-Jun-2025
 */

public class LogLevelDemo {

    private static final Logger logger = LoggerFactory.getLogger(LogLevelDemo.class);

    public static void main(String[] args) {

        System.out.println("Demonstrating Logging Level Hierarchy:\n");

        logger.trace("TRACE: Fine-grained debug message (lowest level)");
        logger.debug("DEBUG: Developer-oriented debug information");
        logger.info("INFO: Runtime event (normal operation)");
        logger.warn("WARN: Warning, something unexpected but not an error");
        logger.error("ERROR: An error occurred (highest standard level)");
    }
}
