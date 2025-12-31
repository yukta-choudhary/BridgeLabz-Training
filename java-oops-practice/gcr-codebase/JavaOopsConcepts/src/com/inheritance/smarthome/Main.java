package com.inheritance.smarthome;

import java.util.Scanner;

/*
Main class to test single inheritance
*/

public class Main {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Create Thermostat object
        Thermostat t = new Thermmostat();

        // Take device details from user
        System.out.print("Enter Device ID: ");
        t.deviceId = input.nextLine();

        System.out.print("Is device ON (true/false): ");
        t.status = input.nextBoolean();

        System.out.print("Enter temperature setting: ");
        t.temperatureSetting = input.nextInt();

        // Display device status
        t.displayStatus();
    }
}
