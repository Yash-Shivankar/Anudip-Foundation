package com.Anudip;
public class StringConcatenation {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        String result1 = str1 + " " + str2;
        System.out.println("Result using + operator: " + result1);

        String result2 = str1.concat(" ").concat(str2);
        System.out.println("Result using concat() method: " + result2);
    }
}

/*
Result using + operator: Hello World
Result using concat() method: Hello World
*/