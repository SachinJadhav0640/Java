package com.myjava.basics.exceptionhandling;

/*Assignment 5: Custom Exception for Age Validation
Problem: Create a custom InvalidAgeException and a program to validate ages,
throwing the exception for invalid ages and handling it with try-catch.*/

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
// Class to test age validation
class AgeValidator {
    public static void validateAge(int age) throws InvalidAgeException {
        if (age<0){
            throw new InvalidAgeException("Age cannot be negative " + age);
        }else if (age<18) {
            throw new InvalidAgeException("You must be at least 18 years old. Entered age: " + age);
        } else if (age > 150) {
            throw new InvalidAgeException("Age is unrealistically high: " + age);
        }
        System.out.println("Age is valid: " + age);
    }
    public static void main(String[] args) {
        // Test ages
        int[] ages = {18, 17, -5, 70, 200};
        //loop through ages
        for(int age: ages){
            //try block for validation
            try{
                validateAge(age);
            }
            //catch custom exception
            catch (InvalidAgeException e){
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}

/*
Explanation: Defines a custom InvalidAgeException and throws it for invalid ages, handling it with try-catch for user-friendly error messages.

Practice Tip: Add a minimum age requirement (e.g., 18) and update the exception message*/