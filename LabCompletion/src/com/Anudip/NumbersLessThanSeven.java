package com.Anudip;
import java.util.TreeSet;

public class NumbersLessThanSeven {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
        numbers.add(9);
        numbers.add(11);

        System.out.println("Numbers less than 7:");
        for (Integer number : numbers.headSet(7)) {
            System.out.println(number);
        }
    }
}

/*
Numbers less than 7:
1
3
5
*/