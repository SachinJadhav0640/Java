package com.myjava.basics.flowcontrol;

/*Assignment 4: Print Numbers 10 to 1 (Using while Loop)
Problem: Write a program to print numbers from 10 down to 1 using a while loop*/

public class CountDown {
    public static void main(String[] args) {
        int number = 10;
        while (number >= -7) {
            System.out.println(number);
            number--;
        }
    }
}

/*
Explanation:

Uses a while loop, which continues as long as number >= 1.
Decrements number in each iteration.
Practice Tip: Try rewriting this using a for loop to see the difference.*/
