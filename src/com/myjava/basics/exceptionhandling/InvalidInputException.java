package com.myjava.basics.exceptionhandling;

/*Assignment 4: Handling String Parsing
Problem: Create a program to parse a string to an integer, handling NumberFormatException and throwing a custom exception for invalid input.*/

class InvalidInputException extends Exception{
    // Constructor with error message
    public InvalidInputException(String message){
        super(message);
    }
}
// Class to test string parsing
class NumberParserTest {
    // Method that parses string and may throw exceptions
    public static int parseNumber(String input) throws InvalidInputException {
        // Check for null or empty input
        if (input == null || input.trim().isEmpty()) {
            // Throw custom exception
            throw new InvalidInputException("Input cannot be null or empty");
        }
        // Try to parse string to integer
        try{
            return Integer.parseInt(input);
        }
        // Catch parsing error
        catch (NumberFormatException e) {
            throw new InvalidInputException("Invalid Number format: " + input);
        }
    }
    public static double parseDouble(String input) throws InvalidInputException {
        // Check for null or empty input
        if (input == null || input.trim().isEmpty()) {
            // Throw custom exception
            throw new InvalidInputException("Input cannot be null or empty");
        }
        // Try to parse string to integer
        try{
            return Double.parseDouble(input);
        }
        // Catch parsing error
        catch (NumberFormatException e) {
            throw new InvalidInputException("Invalid decimal format: " + input);
        }
    }

    public static void main(String[] args) {
        // Test input string
        String input = "78!74";
        // Try block for parsing
        try {
            // Call parsing method
            int number = parseNumber(input);
            System.out.println("Parsed Number: " + number);
        }
        // Catch custom exception
        catch (InvalidInputException e) {
            // Print error message
            System.out.println("Error: " + e.getMessage());
        }
        String doubleInput = "37.387";
        try {
            double decimal = parseDouble(doubleInput);
            System.out.println("Parsed double: " + decimal);
        }
        catch (InvalidInputException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}

/*
Explanation: Handles NumberFormatException during string parsing, wrapping it in a custom InvalidInputException for clearer error reporting.

Practice Tip: Add support for parsing doubles and handle decimal inputs.*/
