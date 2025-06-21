package com.myjava.basics.interfaces;

/*Assignment 5: Multiple Interface Implementation for Transactions
Problem: Create Loggable and Auditable interfaces with log and audit methods.
Create a Transaction class implementing both. Use interface references in main.*/

interface Loggable {
    void log();
}
interface Auditable {
    void audit();
}
class Transaction implements Loggable , Auditable {
    private String ID;
    public Transaction (String ID){
        this.ID=ID;
    }
    @Override
    public void log() {
        System.out.println("Logging Transaction: " + ID);
    }
    @Override
    public void audit() {
        System.out.println("Auditing Transaction: " + ID);
    }
}
class Payment implements Loggable , Auditable {
    private String message;
    public Payment (String message){
        this.message=message;
    }
    @Override
    public void log() {
        System.out.println("Logging Payment: " + message);
    }
    @Override
    public void audit() {
        System.out.println("Auditing Payment: " + message);
    }
}
class LoggableTest {
    public static void main(String[] args) {
        Loggable logger = new Transaction("LX937");// Interface reference for Loggable
        Auditable auditor = new Transaction("AX737");
        logger.log();
        auditor.audit();
        Loggable paymentlogger = new Payment("Paid via UPI");
        paymentlogger.log();
        Auditable paymentAudting = new Payment("Paid via NEFT");
        paymentAudting.audit();
    }
}
/*
Explanation: Shows multiple interface implementation: Transaction implements both Loggable and Auditable, accessed via
separate references.

Practice Tip: Add a Payment class implementing both interfaces with different messages*/
