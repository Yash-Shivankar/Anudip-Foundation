package com.Anudip;

public class StaticDemo {
	static int a = 0;
	public void display() {
		a = a + 1;
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		StaticDemo s1 = new StaticDemo();
		s1.display();
		StaticDemo s2 = new StaticDemo();
		s2.display();
		StaticDemo s3 = new StaticDemo();
		s3.display();
	}
}

/*
1
2
3

*/