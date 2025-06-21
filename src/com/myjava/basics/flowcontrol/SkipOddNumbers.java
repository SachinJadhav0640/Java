package com.myjava.basics.flowcontrol;

/*Assignment 6: Skip Odd Numbers in a Loop (Using for and continue)
Problem: Write a program to print numbers from 1 to 20, but skip odd numbers using continue.*/

public class SkipOddNumbers {
    public static void main(String[] args) {
//        int number = 0;
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) { //if the number is odd
                continue; //skip the next iteration
            }
            System.out.println(i);
        }
    }
}

/*
Explanation:

Uses a for loop to iterate from 1 to 20.
        continue skips the rest of the loop body for odd numbers (i % 2 != 0).
Only even numbers are printed.
Practice Tip: Modify the program to skip even numbers instead and print only odd numbers.*/
