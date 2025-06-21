package com.myjava.basics.exceptionhandling;

/*Assignment 6: Exception Handling in Library Checkout
Problem: Create a custom BookNotAvailableException and a program to simulate book borrowing,
handling the exception when a book is unavailable, using encapsulation.*/

public class BookNotAvailableException extends RuntimeException {
  public BookNotAvailableException(String message) {
    super(message);
  }
}
class Book {
  private String title;
  private boolean isAvailable;

  public Book(String title){
    this.title = title;
    this.isAvailable=true;
  }
  // Method to borrow book, may throw exception
  public void borrow() throws BookNotAvailableException{
    // Check availability
    if(!isAvailable){
      throw new BookNotAvailableException("Book " + title + " is not Available");
    }
    isAvailable=false;
    System.out.println("Borrowed: " + title);
  }
  public void returnBook(){
    // Update availability
    isAvailable=true;
    System.out.println("Returned: " + title);
  }
}
class LibraryCheckoutTest {
  public static void main(String[] args) {
    Book book = new Book("Java Basics");
    // Try block for borrowing
    try{
      book.borrow();
      book.borrow();
    }
    catch (BookNotAvailableException e){
      System.out.println("Error: " + e.getMessage());
    }
    // Return book and try borrowing again
    book.returnBook();
    try{
      book.borrow();
    }
    catch (BookNotAvailableException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}
/*
Practice Tip: Add a DVD class with similar borrowing logic and a custom DVDNotAvailableException.*/
