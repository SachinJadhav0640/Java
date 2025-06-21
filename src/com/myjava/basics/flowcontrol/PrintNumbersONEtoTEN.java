package com.myjava.basics.flowcontrol;


/*Assignment 3: Print Numbers 1 to 10 (Using for Loop)
Problem: Write a program to print numbers from 1 to 10 using a for loop.*/

public class PrintNumbersONEtoTEN {
    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println(i);
        }
    }
}

/*
Explanation:

Uses a for loop with a counter i starting at 1 and incrementing until 10.
The loop runs a fixed number of times (10 iterations).
Practice Tip: Modify the loop to print only even numbers (hint: use i += 2 or add an if condition).*/
