package com.sentrydebuggingexample;

import io.sentry.Sentry;
import java.lang.Exception;

public class Main {

    public static void main(String[] args) {

        Sentry.init(options -> {
            options.setDsn("https://3e474d6f852f1e06bf475241b3326008@o4508335306244096.ingest.de.sentry.io/4508335317254224");
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