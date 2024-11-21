package com.sentrydebuggingexample;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingLevelsExample {
    private static final Logger logger = Logger.getLogger(LoggingLevelsExample.class.getName());

    public static void main(String[] args) {
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);

        ConsoleHandler handler = new ConsoleHandler(); 
        handler.setLevel(Level.FINE);
        
        logger.addHandler(handler);

        logger.fine("This is a debug message");
        logger.config("This is a configuration message");
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe error message");
    }
}