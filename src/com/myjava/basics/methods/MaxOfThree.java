package com.myjava.basics.methods;

/*Assignment 6: Find the Maximum of Three Numbers
Problem: Write a method that takes three integers as parameters and returns the
largest one. Call the method from main and print the result.*/

public class MaxOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 6;
        int c = 20;
        int max = findMax(a, b, c);
        System.out.println("Maximum of " + a + " , " + b + " , " + c + " is: " +max);
    }
    public static int findMax(int num1, int num2, int num3) {
        if (num1 >= num2 && num2 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}

/*
Explanation:

Defines a method findMax that takes three parameters and returns the largest.
Uses if-else statements (from Control Flow) to compare the numbers.
Calls the method from main and prints the result.
Practice Tip: Test with different sets of numbers (e.g., 5, 5, 5 or 3, 10, 2).*/
