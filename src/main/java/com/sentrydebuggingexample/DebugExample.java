package com.sentrydebuggingexample;

public class DebugExample {
    public static void main(String[] args) {
        int a = 50;
        
        int x = 5;
        
        int b = x - x;
        
        int result = divide(a, b); 
        
        System.out.println("Result: " + result);
    }

    public static int divide(int x, int y) {
    	
    	int answer = x / y; // Set a breakpoint here
    	
        return answer;
    }
}

