package com.corkBoard.controller.entity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * A class to represent users
 */

public class User {

    private final Logger logger = LogManager.getLogger(this.getClass());

    public void logStuff() {
        logger.info("Log testing");
    }

}