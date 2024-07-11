package com.Anudip;
public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {

            throw new NullPointerException("This is a deliberate NullPointerException");
        } catch (NullPointerException e) {

            System.out.println("Caught an exception: " + e.getMessage());
        } finally {

            System.out.println("This block always executes.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

/*
Caught an exception: This is a deliberate NullPointerException
This block always executes.
Program continues after exception handling.
*/