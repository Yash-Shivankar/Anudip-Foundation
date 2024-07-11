package com.Anudip;
public class StringComparison {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        String sequence = "Hello";

        boolean isEqual = str.equals(sequence);

        if (isEqual) {
            System.out.println("String \"" + str + "\" is equal to the sequence \"" + sequence + "\".");
        } else {
            System.out.println("String \"" + str + "\" is not equal to the sequence \"" + sequence + "\".");
        }
    }
}

/*
String "Hello, World!" is not equal to the sequence "Hello".
*/