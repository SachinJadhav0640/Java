package com.myjava.basics.exceptionhandling;
import java.util.Scanner;
/*Problem: Create a program to divide two numbers, handling ArithmeticException for division by zero using try-catch.*/

public class DivideNumbersTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the Second Number: ");
        int b = scanner.nextInt();
//        int a = 10;
//        int b = 0;
        // Try block to contain code that might throw an exception
        try{
            int result = a/b;
            System.out.println("Result: " + result);
        }
        // Catch block to handle ArithmeticException
        catch (ArithmeticException e) {
            System.out.println("Number cant be divided by 0");
            System.out.println("Please enter the Non Zero Number to proceed with the operation");
            b = scanner.nextInt(); // reassign to the same variable
            if(b != 0){
                int result = a / b;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Still Zero - Cannot proceed");
            }
        }
        scanner.close();
    }
}
/*
Explanation: Uses try-catch to handle ArithmeticException when dividing by zero, preventing program crashes.

Practice Tip: Add a loop to let users input numbers and retry after an exception.*/
