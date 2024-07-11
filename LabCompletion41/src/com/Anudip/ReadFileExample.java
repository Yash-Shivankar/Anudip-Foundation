package com.Anudip;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileExample {
    public static void readFile(String filename) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw e;
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                }
            }
        }
    }

    public static void main(String[] args) {
    	String filename = "C:\\Users\\Yash\\OneDrive\\Documents\\Java.txt";

        try {
            readFile(filename);
        } catch (IOException e) {
            System.out.println("File not found or cannot be read: " + e.getMessage());
        }
    }
}

/*
Java is a high level, static, platform independent, general purpose language.

Class does not acquire any kind of memory, logical quantity, blue print of object

It use objects to acquire memory

Object is a instance of a class
*/
