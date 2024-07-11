package com.AnudipExercise;
import java.util.Scanner;

public class ExerciseForSum {
	public static void main(String[] args) {
		int i, n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input:");
		n = sc.nextInt();
		
		System.out.println("The numbers are :" + n);
		for(i = 0; i<=n; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("The sum of the "+ n +" numbers is " + sum);
	}
}

/*
Enter the Input:
10
The numbers are :10
0
1
2
3
4
5
6
7
8
9
10
The sum of the 10 numbers is 55
*/