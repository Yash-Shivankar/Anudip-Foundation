package com.Anudip;
import java.util.Scanner;

public class EvenNumberChecker {
    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException("The number is odd.");
        }
        System.out.println("The number is even.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        try {
            checkEvenNumber(number);
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Enter an integer: 43
The number is odd.
*/