package com.myjava.basics.interfaces;

/*Assignment 3: Interface for Notifications
Problem: Create a Notifiable interface with a
        sendNotification method. Create Payable and SMS classes implementing Notifiable. Use an array of Notifiable references in main.*/

public interface Notifyable {
    void sendNotification(String message);
}
class Email implements Notifyable{
    private String emailAddress;

    public Email(String emailAddress){
        this.emailAddress = emailAddress;
    }
    @Override
    public void sendNotification(String message){
        System.out.println("Email sent to " + emailAddress + ": " + message);
    }
}
class SMS implements Notifyable{
    private String phoneNumber;

    public SMS(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent to " + phoneNumber + ": " + message);
    }
}
class pushNotification implements Notifyable{
    private String deviceID;

    public pushNotification(String deviceID){
        this.deviceID=deviceID;
    }
    @Override
    public void sendNotification(String message) {
        System.out.println("Notification sent to " + deviceID + ": " + message);
    }
}
class NotifyableTest {
    public static void main(String[] args) {
        // Array of interface references
        Notifyable[]  notification = new Notifyable[3];
        // Assigning Email object
        notification[0] = new Email("SachinRJ0640@gmail.com");
        // Assigning SMS object
        notification[1] = new SMS("4942875355");
        notification[2] = new pushNotification("01HW");

        // Loop through array for polymorphic calls
        for (Notifyable n : notification) {
            n.sendNotification("Hello!. this is a test");
        }
    }
}

/*
Explanation: Uses an array of Notifiable references for polymorphic sendNotification calls, showing interfaces can unify unrelated classes.

Practice Tip: Add a PushNotification class implementing Notifiable with a device ID.*/
