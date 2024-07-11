package com.Anudip;
public class StringFromCharArray {
    public static void main(String[] args) {
        char[] charArray = {'J', 'a', 'v', 'a'};

        String str = new String(charArray);

        System.out.println("String created from char array: " + str);
    }
}

/*
String created from char array: Java
*/