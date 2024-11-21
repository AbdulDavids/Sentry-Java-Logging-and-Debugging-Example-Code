package com.sentrydebuggingexample;

import io.sentry.Sentry;

public class Main {

    public static void main(String[] args) {

        Sentry.init(options -> {
            options.setDsn("<YOUR_DSN_HERE>");
            options.setTracesSampleRate(1.0);
            options.setDebug(true);
        });

        try {
        
            int result = divide(50, 0); // This will throw an exception
            System.out.println("Result: " + result);

        } catch (Exception e) {
            Sentry.captureException(e); // This will send the exception to Sentry
        }
    }

    public static int divide(int x, int y) {
        return x / y; 
    }

}