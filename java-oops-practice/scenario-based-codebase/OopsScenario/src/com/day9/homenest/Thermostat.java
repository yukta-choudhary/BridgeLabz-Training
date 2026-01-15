package com.day9.homenest;

//Thermostat device class
public class Thermostat extends Device {

 public Thermostat(int deviceId) {
     super(deviceId);
 }

 // Polymorphism
 public void reset() {
     energyUsage = energyUsage * 0;
     System.out.println("Thermostat temperature reset");
 }
}

