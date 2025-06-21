package com.myjava.basics.encapsulation;

public class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        setBalance(balance); //using setters for enforcing validation
    }
    //getters
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    //setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance=balance;
        } else {
            System.out.println("Error: Balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345",5000);
        System.out.println("Bank Account Number: " +account.getAccountNumber() + " and balance is: " +account.getBalance());
        //TestValidation
        account.setBalance(-500); // Should print error and set to 0
        System.out.println("Bank Account Number: " +account.getAccountNumber() + " and balance is: " +account.getBalance());
        account.setBalance(2000);
        System.out.println("Bank Account Number: " +account.getAccountNumber() + " and balance is: " +account.getBalance());
    }
}
/*
Explanation:

balance is private, and the setter setBalance ensures it’s not negative.
Validation in the setter protects the data from invalid updates.
Practice Tip: Add validation to setAccountNumber to ensure it’s not empty (e.g., if (accountNumber.isEmpty())).*/
