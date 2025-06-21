package com.myjava.basics.flowcontrol;

import java.util.Scanner;

/*Assignment 2: Print Day of the Week (Using switch)
Problem: Write a program that takes a number (1-7) representing a day of the week (1 = Monday, 7 = Sunday) and
prints the corresponding day. If the number is invalid, print an error message.*/

public class DayOfWeek {
    public static void main(String[] args){
        Scanner nc1 = new Scanner(System.in);
        System.out.println("Please Enter a Number between 1 and 7. ");
        int day = nc1.nextInt();
//        int day = 9;
        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day!  Please Enter a Number between 1 and 7.");
        }
    }
}

/*
Explanation:

Uses a switch statement to map numbers to days.
The default case handles invalid inputs.
break ensures the program exits the switch after a match.
Practice Tip: Test with day = 8 to see the default case, or day = 1 for Monday.*/
