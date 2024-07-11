package com.Anudip;
import java.util.Scanner;

public class ScannerSample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for x:");
		int x = sc.nextInt();
		
		if(x < 20) {
			System.out.println("Yes, It is less");
		}
		else if(x > 20)
		{
			System.out.println("Its greater than 20");
		}
		else {
			System.out.println("x is equal to 20");
		}
	}
}

/*
Enter the value for x:
50
Its greater than 20

Enter the value for x:
20
x is equal to 20

Enter the value for x:
10
Yes, It is less

*/