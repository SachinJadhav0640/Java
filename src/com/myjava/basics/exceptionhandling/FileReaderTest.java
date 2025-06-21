package com.myjava.basics.exceptionhandling;

/*Assignment 2: Handling File Reading
Problem: Create a program to read a file, handling IOException with try-catch-finally to ensure resource cleanup.*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileReaderTest {
    public static void main(String[] args) {
        BufferedReader reader = null; // Initialize reader as null
        // Try block for file operations
        try{
            // Attempt to open and read a file
            reader = new BufferedReader(new FileReader("nonexistent.txt"));
            String line = reader.readLine();
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Error: File not found - " + e.getMessage());
        }
        // Catch block for IOException
        catch (IOException e) {
            // Print error if file operation fails
            System.out.println("Error: Unable to read the file" + e.getMessage());
        }
        // Finally block for cleanup
        finally {
            // Close reader if it was opened
            try {
                if(reader != null) {
                    reader.close();
                    System.out.println("File reader closed");
                   }
                } catch (IOException e) {
                    System.out.println("Error closing the reader" + e.getMessage());
            }
        }
    }
}
/*Explanation: Handles IOException during file reading, using finally to ensure the reader is closed, demonstrating resource management.

Practice Tip: Modify to read an existing file and handle FileNotFoundException separately.*/