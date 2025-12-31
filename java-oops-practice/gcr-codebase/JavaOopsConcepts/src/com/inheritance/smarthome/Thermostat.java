package com.inheritance.smarthome;

/*
Subclass: Thermostat
Inherits Device and adds temperature setting
*/

public class Thermostat extends Device {

    int temperatureSetting;

    // Override displayStatus method
    @Override
    void displayStatus() {
        super.displayStatus(); // Call Device method
        System.out.println("Temperature: " + temperatureSetting + "°C");
    }
}
