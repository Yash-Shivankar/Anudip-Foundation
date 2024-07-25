package com.Anudip;
import java.util.Scanner;

public class Spaces {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        
        String result = "";
        boolean inSpace = false;

        for (char c : sentence.toCharArray()) {
            if (c == ' ') {
                if (!inSpace) {
                    result += '#';
                    inSpace = true;
                }
            } else {
                result += c;
                inSpace = false;
            }
        }

        System.out.println(result);
        scanner.close();

		
	}

}

/*
Enter a sentence:
I have    many friends
I#have#many#friends
*/
