package com.myjava.basics.enums;

/*Assignment 3: Enum for Book Genres
Problem: Create a BookGenre enum with genres (FICTION, NONFICTION, MYSTERY) and descriptions.
Add a method to get the description and print all genres in main.*/

public enum BookGenre {
    // Enum constants with descriptions
    FICTION("Imaginative Stories", 4),
    NONFICTION("Factual Content" , 3),
    MYSTERY("Crime and Suspence" , 5);

    // Private field for description
    private String description;
    private int rating;

    // Constructor to set description
    BookGenre(String description, int rating){
        this.description = description;
        this.rating = rating;
    }

    // Method to get description
    public String getDescription(){
        return description;
    }

    // Method to get Rating
    public int getRating(){
        return rating;
    }
}
// Class to test BookGenre enum
class BookGenreTest {
    public static void main(String[] args) {
        BookGenre genre = BookGenre.MYSTERY;
        System.out.println("Genre: " + genre + " | Description: " + genre.getDescription() + " | Rating ★ : " + genre.getRating());
    }
}

/*
Explanation: Uses BookGenre with a field and method, demonstrating enum iteration with values() and data encapsulation.

Practice Tip: Add a field for popularity rating and a method to get it.*/
