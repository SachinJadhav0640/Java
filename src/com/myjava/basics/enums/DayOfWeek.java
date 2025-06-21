package com.myjava.basics.enums;

/*Assignment 1: Enum for Days of the Week
Problem: Create a DayOfWeek enum for days of the week. Use a switch statement in main to print a message based on the day.*/

// Enum to represent days of the week
public enum DayOfWeek {
    // Enum constants
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}
// Class to test DayOfWeek enum
class DayOfWeekTest {
    public static void main(String[] args) {
        // Select a day for testing
        DayOfWeek day = DayOfWeek.FRIDAY;

        // Switch statement to handle enum values
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println(day + " is a weekday. Time to work!.");
                break;
            case FRIDAY:
                System.out.println(day + " is Friday - Almost weekend!.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println(day + "is a weekend. Relax!.");
                break;
            // Default case (not needed for enums, but good practice)
            default:
                System.out.println("Invalid Day");
        }
    }
}
/*
Explanation: Uses a simple DayOfWeek enum with a switch statement to demonstrate type-safe constant usage and conditional logic.

Practice Tip: Add a method to DayOfWeek that returns whether it’s a weekday or weekend.*/
