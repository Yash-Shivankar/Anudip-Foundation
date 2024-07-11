/* package com.AnudipExercise;
import java.util.Scanner;

public class VowelandConsonant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Characters: ");
		String input = sc.next().toLowerCase();
		
		boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
		boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
		
		boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
		
		if (input.length() > 1) {
			System.out.println("Error. Not a single character");
		}
		else if(!uppercase || lowercase) {
			System.out.println("Error. Not a letter. Enter uppercase or lowercse letter");
		}
		else if (vowels) {
			System.out.println("Input letter is Vowel");
		}
		else {
			System.out.println("Input letter is Consonent");
		}
	}
}
*/
package com.AnudipExercise;
import java.util.Scanner;

public class VowelandConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        String input = sc.next().toLowerCase();
        
        // Check if input is a single character
        if (input.length() > 1) {
            System.out.println("Error. Not a single character.");
        } else {
            char ch = input.charAt(0);
            
            // Check if input is a letter
            if (ch >= 'a' && ch <= 'z') {
                // Check if input is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    System.out.println("Input letter is a Vowel.");
                } else {
                    System.out.println("Input letter is a Consonant.");
                }
            } else {
                System.out.println("Error. Not a letter. Enter an uppercase or lowercase letter.");
            }
        }
    }
}

