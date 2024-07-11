package com.Anudip;
import java.util.Arrays;

public class ArrayDemo2 {
	public static void main(String[] args) {
		int[] a = {12, 21, 10, 5, 7};
		// int [] b = new int[a.length];
		//int[] b = Arrays.copyOf(a, a.length);
		int[] b = a.clone();
		for(int i=0; i<a.length; i++) {
//			//b[i] = a[i];
			System.out.println(b[i]);
		}
	}

}

/*
12
21
10
5
7
*/