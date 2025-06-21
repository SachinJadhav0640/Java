package com.myjava.basics.methods;

public class evenOddChecker {
    public static void main(String[] args) {
        int number = -4;
        boolean isEven = isEven(number);
        System.out.println(number + " is " + (isEven ? "even" : "odd"));
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
}

/*
Explanation:

Defines a method isEven with a boolean return type.
Uses the modulo operator (%) to check if the number is divisible by 2.
Calls the method and uses a ternary operator in main to print the result.
Practice Tip: Test with different numbers (e.g., 7, 0, -4) and see the output.*/
