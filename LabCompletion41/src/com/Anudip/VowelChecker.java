package com.Anudip;
public class VowelChecker {
    public static void checkForVowels(String input) throws NoVowelsException {

        String lowerCaseInput = input.toLowerCase();

        if (!lowerCaseInput.matches(".*[aeiou].*")) {
            throw new NoVowelsException("The string does not contain any vowels.");
        }
        
        System.out.println("The string contains vowels.");
    }
    
    public static void main(String[] args) {

        String test1 = "Hello";
        String test2 = "Rhythm";
        
        try {

            checkForVowels(test1);
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage());
        }

        try {

            checkForVowels(test2);
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage());
        }
    }
}

/*
The string contains vowels.
The string does not contain any vowels.
 */


