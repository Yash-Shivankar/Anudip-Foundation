package com.Anudip;
import java.util.LinkedList;

public class FirstLastOccurrence {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        numbers.add(50);
        numbers.add(20);

        int specifiedElement = 20;

        int firstOccurrence = numbers.indexOf(specifiedElement);
        if (firstOccurrence != -1) {
            System.out.println("First occurrence of element " + specifiedElement + " is at index: " + firstOccurrence);
        } else {
            System.out.println("Element " + specifiedElement + " is not found in the list.");
        }

        int lastOccurrence = numbers.lastIndexOf(specifiedElement);
        if (lastOccurrence != -1) {
            System.out.println("Last occurrence of element " + specifiedElement + " is at index: " + lastOccurrence);
        } else {
            System.out.println("Element " + specifiedElement + " is not found in the list.");
        }
    }
}

/*
First occurrence of element 20 is at index: 1
Last occurrence of element 20 is at index: 6 
 */
