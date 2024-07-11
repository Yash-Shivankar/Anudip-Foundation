package com.Anudip;

public class ArrayDemo {
	public static void main(String[] args) {
		int[] arrayVariable1;
		arrayVariable1 = new int[10];
		
		arrayVariable1[2] = 12;
		arrayVariable1[3] = 20;
		arrayVariable1[5] = 35;
		arrayVariable1[7] = 45;
		arrayVariable1[9] = 10;
		
		System.out.println(arrayVariable1[3]);
		
		int[] a = { 12, 13, 24, 25, 65};
		int[] b = a;
		for(int i = 0; i<b.length; i++) {
			System.out.println(b[i]);
		}
		
	}
}

/*
20
12
13
24
25
65
*/