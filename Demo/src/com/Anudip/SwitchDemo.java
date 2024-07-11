package com.Anudip;

public class SwitchDemo {
	public static void main(String[] args) {
		char grade = 'A';
		
		switch(grade) {
		case 'A':
			System.out.println("Grade A: Excellent");
			break;
		case 'B':
			System.out.println("Grade B : Good");
			break;
		case 'C':
			System.out.println("Grade C: Average");
			break;
		case 'D':
			System.out.println("Grade D: Poor");
			break;
		default:
			System.out.println("invalid Grade");
		}
			
		System.out.println("Your grade is : " + grade);
	}
}

/*
Grade A: Excellent
Your grade is : A
 */
