package com.myjava.basics.enums;

/*Assignment 6: Enum for Library Item Status
Problem: Create a LibraryItemStatus enum with statuses (AVAILABLE, BORROWED, RESERVED).
Integrate with a Book class for borrowing logic, using encapsulation and exception handling in main.*/
class BorrowingException extends Exception{
    public BorrowingException (String message){
        super(message);
    }
}
// Enum for library item statuses
public enum LibraryItemStatus {
    // Enum for library item statuses
    AVAILABLE, BORROWED, RESERVED;

    // Method to check if borrowing is allowed
    public boolean canBorrow(){
        // Only AVAILABLE items can be borrowed
        return this == AVAILABLE || this == RESERVED;
    }
    // Method to check if reservation is allowed
    public boolean canReserve(){
        // only AVAILABLE items can be Reserved
        return this == AVAILABLE;
    }
}
// Class representing a book
class Book {
    // Private fields for encapsulation
    private String title;
    private LibraryItemStatus status;

    // Constructor to initialize book
    public Book(String title){
        this.title = title;
        this.status = LibraryItemStatus.AVAILABLE;
    }
    // Method to borrow book
    public void borrow() throws BorrowingException {
        if(!status.canBorrow()){
            throw new BorrowingException("Cannot Borrow: " + title + " is " + status);
        }
        // Update status
        status = LibraryItemStatus.BORROWED;
        System.out.println("Borrowed: " + title);
    }
    // Method to return book
    public void returnBook(){
        // Update status
        status =  LibraryItemStatus.AVAILABLE;
        System.out.println("Returned: " + title);
    }
    public void reserve() throws BorrowingException{
        if(!status.canReserve()){
            throw new BorrowingException("Cannot Reserve: " + title + " is " + status);
        }
        // update status
        status = LibraryItemStatus.RESERVED;
        System.out.println("Reserved: " + title);
    }
//    public String getStatus() {
//        return status.name();
//    }
}
// Class to test LibraryItemStatus and Book
class LibraryItemStatusTest{
    public static void main(String[] args) {
        // Create a book
        Book book = new Book("Java Guide");
        // Try block for borrowing
        try {
            //Attempt to borrow
            book.reserve();
            book.borrow();
            // Try borrowing again (should throw exception)
            book.borrow();

        }
        // Catch custom exception
        catch (BorrowingException e){
            System.out.println("Error: " + e.getMessage());
        }

        // Return and try borrowing again
        book.returnBook();
        try{
            // Borrow after returning
            book.borrow();
            book.reserve();
        } catch (BorrowingException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

//Practice Tip: Add a RESERVED status transition (e.g., AVAILABLE -> RESERVED -> BORROWED).