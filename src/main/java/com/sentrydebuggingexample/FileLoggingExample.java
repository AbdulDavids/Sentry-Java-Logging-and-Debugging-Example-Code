package com.sentrydebuggingexample;

import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class FileLoggingExample {
    private static final Logger logger = Logger.getLogger(FileLoggingExample.class.getName());

    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {
        try {
            FileHandler fileHandler = new FileHandler("application.log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            logger.severe("Failed to set up file handler for logging");
        }

        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe error message");
    }
}

