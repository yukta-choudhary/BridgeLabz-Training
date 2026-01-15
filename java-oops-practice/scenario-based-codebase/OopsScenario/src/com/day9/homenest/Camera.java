package com.day9.homenest;

//Camera device class
public class Camera extends Device {

 public Camera(int deviceId) {
     super(deviceId);
 }

 // Polymorphism
 public void reset() {
     energyUsage = 2 + 3; // operator usage
     System.out.println("Camera reset with security check");
 }
}
