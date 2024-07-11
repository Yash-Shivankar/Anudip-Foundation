package com.Anudip;
import java.util.Scanner;

public class VotingApplication {
    public static void checkVotingEligibility(int age) throws UnderageException {
        if (age < 18) {
            throw new UnderageException("You must be at least 18 years old to vote.");
        }
        System.out.println("You are eligible to vote.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkVotingEligibility(age);
        } catch (UnderageException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

/*
Enter your age: 21
You are eligible to vote.
*/