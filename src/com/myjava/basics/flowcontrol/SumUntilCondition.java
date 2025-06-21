package com.myjava.basics.flowcontrol;


/*Assignment 5: Sum of Numbers Until a Condition (Using do-while and break)
Problem: Write a program that keeps adding numbers (starting from 1) until the sum exceeds 50,
then prints the sum and the last number added. Use a do-while loop and break.*/

public class SumUntilCondition {
    public static void main(String[] args) {
        int sum = 0;
        int number = 1;
        do {
            sum += number;
            if (sum > 50) {
                System.out.println("Sum exceeded 50: " + sum);
                System.out.println("last number added is: " + number);
                break;
            }
            number++;
        }
        while (true);
    }
}
/*
Explanation:

Uses a do-while loop, which ensures at least one iteration.
        break exits the loop when sum > 50.
Practice Tip: Modify the condition to stop when the sum exceeds 100 and observe the new output.*/
