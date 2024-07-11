package com.Anudip;
import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);
        numbers.add(3);

        System.out.println("Original ArrayList: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted ArrayList: " + numbers);
    }
}

/*
Original ArrayList: [5, 2, 9, 1, 3]
Sorted ArrayList: [1, 2, 3, 5, 9]
*/