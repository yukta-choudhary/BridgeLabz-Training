package com.inheritance.smarthome;

/*
Superclass: Device
Stores common device details
*/

public class Device {

    String deviceId;
    boolean status;

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
