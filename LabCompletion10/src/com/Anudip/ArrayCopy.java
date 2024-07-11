package com.Anudip;
public class ArrayCopy {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};

        int[] copiedArray = new int[originalArray.length];

        for (int i = 0; i < originalArray.length; i++) {
            copiedArray[i] = originalArray[i];
        }

        System.out.print("Original Array: ");
        printArray(originalArray);

        System.out.print("Copied Array: ");
        printArray(copiedArray);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

/*
Original Array: 1 2 3 4 5 
Copied Array: 1 2 3 4 5 
*/