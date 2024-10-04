package com.corkBoard.persistence;


import junit.framework.TestCase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerTest extends TestCase {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public void testLogger() {
        logger.debug("Debug message");
        logger.warn("Warning message");
        logger.error("Error message");
        logger.info("Info message");
        System.out.println("Is this thing on?");
    }

}
