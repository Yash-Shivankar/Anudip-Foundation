package com.Anudip;
import java.util.HashSet;
import java.util.Iterator;

public class IterateHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Elderberry");

        System.out.println("Using enhanced for loop:");
        for (String fruit : hashSet) {
            System.out.println(fruit);
        }

        System.out.println("\nUsing iterator:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
    }
}

/*
Apple
Cherry
Date
Elderberry
Banana
*/