package com.Anudip;

public class ConstructorDemo {
	void demo(float a, float b){
		float sum = a + b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		ConstructorDemo cd = new ConstructorDemo();
		cd.demo(3,4.6f);
	}

}
