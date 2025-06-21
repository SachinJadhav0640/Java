package com.myjava.basics.flowcontrol;

import java.util.Scanner;

/*Control Flow Practice Assignments
Assignment 1: Check if a Number is Positive, Negative, or Zero (Using if-else)
Problem: Write a program that takes a number as input (hardcode it for now) and prints whether it’s positive,
negative, or zero.*/

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //creating scanner object
        System.out.println(" Enter a Number: ");
        int number = scanner.nextInt(); //Read integer input from user
//        int number = 10;

        if (number > 0) {
            System.out.println(number + " is Positive");
        } else if (number < 0) {
            System.out.println(number + " is Negative");
        } else {
            System.out.println(number + " is Zero");
        }
        /*scanner.close(); //it will help in reusing scanner*/
    }
}
/*
Explanation:

Uses if-else statements to check conditions.
Tests a single condition at a time (number > 0, number < 0, or number == 0).
Practice Tip: Try changing number to -5 or 0 and rerun to see different outputs.*/
