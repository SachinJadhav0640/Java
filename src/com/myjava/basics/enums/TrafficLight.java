package com.myjava.basics.enums;

/*Assignment 2: Enum for Traffic Lights
Problem: Create a TrafficLight enum with colors (RED, YELLOW, GREEN) and
durations. Add a method to get duration and another to get the next light. Test in main.*/

public enum TrafficLight {
    // Enum constants with duration in seconds
    Red(20), Orange(5), Green(20);
    // Private field for duration
    private final int duration;

    // Constructor to initialize duration
    TrafficLight(int duration){
        this.duration = duration;
    }
    // Method to get duration

    public int getDuration() {
        return duration;
    }
    // Method to get next light in sequence
    public TrafficLight getNext(){
        // Use ordinal() to get position and cycle through values
        return values()[(ordinal()+1) % values().length];
    }
    public void safeCross(){
        if (this != Red){
            System.out.println("Unsafe to cross! Please wait until Red light");
        } else {
            System.out.println("It's Safe to Cross!. Happy Strolling...\uD83D\uDEB6\u200D♂\uFE0F ");
        }
    }
}
// Class to test TrafficLight enum
class TrafficLightTest{
    public static void main(String[] args) {
        TrafficLight light = TrafficLight.Red;

        // Print current light and duration
        System.out.println("Current light: " + light);
        System.out.println("Duration: " + light.getDuration() + " Seconds");
        //check if its safe to cross
        light.safeCross();

        // Get and print next light
        light = light.getNext();
        System.out.println("\nNext Light: " + light);
        System.out.println("Duration: " + light.getDuration());
    }
}

/*
Explanation: Defines TrafficLight with fields and methods, showing how enums can encapsulate data and behavior like classes.

Practice Tip: Add a method to check if it’s safe to cross (e.g., return true for RED).*/
