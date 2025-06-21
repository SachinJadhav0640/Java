package com.myjava.basics.enums;

/*Assignment 4: Enum for Order Status
Problem: Create an OrderStatus enum with statuses (PLACED, SHIPPED, DELIVERED, CANCELLED).
Add a method to check if delivery is allowed and test status transitions in main.*/

public enum OrderStatus {
    // Enum constants
    PLACED, SHIPPED, DELIVERED, CANCELED;

    // Method to check if delivery is allowed
    public boolean canDeliver(){
        return this == PLACED || this == SHIPPED;
    }
    public OrderStatus getNextStatus(){
        switch(this) {
            case PLACED:  return SHIPPED;
            case SHIPPED: return DELIVERED;
            default: return null;
        }
    }
}
// Class to test OrderStatus enum
class OrderStatusTest{
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.PLACED;

        System.out.println("Order Status Transition and Delivery Check:");

        while(status != null){
            // Check if delivery is allowed
            System.out.println("Status: " + status + " Can deliver? " + status.canDeliver());
            status = status.getNextStatus();
        }

        System.out.println();

        status = OrderStatus.SHIPPED;
        System.out.println("Status: " + status + " Can deliver? " + status.canDeliver());

        // Test a non-deliverable status
        status = OrderStatus.CANCELED;
        System.out.println("Status: " + status + " Can deliver? " + status.canDeliver());
    }
}

/*
Explanation: Uses OrderStatus with a method to enforce business logic, showing enums can control state transitions.

Practice Tip: Add a method to get the next valid status (e.g., PLACED -> SHIPPED).*/
