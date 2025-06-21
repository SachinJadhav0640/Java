package com.myjava.basics.exceptionhandling;

import java.util.Scanner;

/*Assignment 3: Handling Array Access
Problem: Create a program to access an array, handling ArrayIndexOutOfBoundsException with multiple catch blocks.*/

public class ArrayAccessTest {
    public static void main(String[] args) {
//         Define a small array
//        int[] number = {1, 2, 3};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();

        int[] number = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i=0; i<size; i++){
            number[i] = input.nextInt();
        }
        System.out.print("Enter the index to access: ");
        int index = input.nextInt();
//         Index that may be out of bounds
//        int index = 8;
//         Try block for array access
        try {
            // Attempt to access array element
            System.out.println("Element at index: " + index + ": " + number[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: invalid index " + index);
        }
        catch (Exception e){
            System.out.println("Unexpected Error: " + e.getMessage());
        }
        input.close();
    }
}
/*
Explanation: Uses multiple catch blocks to handle ArrayIndexOutOfBoundsException specifically and a general Exception for robustness.

Practice Tip: Add user input for the index and validate it before accessing the array.*/
