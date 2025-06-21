package com.myjava.basics.enums;

/*Assignment 5: Enum for Planets with Gravity Calculation
Problem: Create a Planet enum with planets (EARTH, MARS, JUPITER), mass, and radius.
Add a method to calculate surface gravity and handle invalid planets with exceptions in main.*/

class InvalidPlanetException extends Exception{
    public InvalidPlanetException(String message){
        super(message);
    }
}

public enum Planet {
    EARTH(5.972e24, 6.371e6),
    MARS(6.417e23, 3.396e6),
    JUPITER(1.899e27, 7.149e7);

    // Private fields for mass and radius
    private double mass;
    private double radius;

    // Constructor to initialize fields
    Planet ( double mass, double radius){
        this.mass = mass;
        this.radius = radius;
    }
    // Method to calculate surface gravity (g = GM/r^2)
    public double surfaceGravity(){
        // Gravitational constant (m^3 kg^-1 s^-2)
        final double G = 6.67430e-11;
        return G * mass / (radius * radius);
    }

    // Method to calculate weight on the planet
    public double weightOnPlanet(double objectMass){
        return objectMass * surfaceGravity();
    }
}
// Class to test Planet enum
class PlanetTest {
    public static void main(String[] args) {
        // Try block for exception handling
        try{
            // Test valid planet
            Planet planet = Planet.EARTH;
            double objectMass = 70; // mass in kg

            System.out.println("Gravity on " + planet + " : " + planet.surfaceGravity() + " m/s^2");
            System.out.printf("Weight of %.1f kg object on %s: %.2f N%n", objectMass, planet, planet.weightOnPlanet(objectMass));
            System.out.println("Weight of " + objectMass + " kg object on " + planet + ": " + planet.weightOnPlanet(objectMass) + " N");


            // Simulate invalid planet input (e.g., null)
            if (false){
                throw new InvalidPlanetException("Invalid Planet");
            }
        }
        // Catch custom exception
        catch (InvalidPlanetException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Explanation: Uses Planet with fields and a method for calculations, integrating exception handling for robustness.

Practice Tip: Add a method to calculate weight on a planet given a mass.*/
