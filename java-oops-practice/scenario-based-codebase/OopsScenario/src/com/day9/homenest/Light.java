package com.day9.homenest;

//Light device class
public class Light extends Device {

 public Light(int deviceId) {
     super(deviceId);
 }

 // Polymorphism
 public void reset() {
     energyUsage = 0;
     System.out.println("Light reset done");
 }
}
