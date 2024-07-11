package com.Anudip;
public class StringContains {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String sequence = "World";

        boolean containsSequence = str.contains(sequence);

        if (containsSequence) {
            System.out.println("String \"" + str + "\" contains the sequence \"" + sequence + "\".");
        } else {
            System.out.println("String \"" + str + "\" does not contain the sequence \"" + sequence + "\".");
        }
    }
}

/*
String "Hello, World!" contains the sequence "World".
*/