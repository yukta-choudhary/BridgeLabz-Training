package com.day9.homenest;

//Base class for all devices
public class Device implements IControllable {

 protected int deviceId;
 private boolean status;          // encapsulated
 protected double energyUsage;

 // Constructor
 public Device(int deviceId) {
     this.deviceId = deviceId;
     this.status = false;
     this.energyUsage = 0;
 }

 // Turn device ON
 public void turnOn() {
     status = true;
     System.out.println("Device " + deviceId + " ON");
 }

 // Turn device OFF
 public void turnOff() {
     status = false;
     System.out.println("Device " + deviceId + " OFF");
 }

 // Reset device (will be overridden)
 public void reset() {
     System.out.println("Device reset");
 }

 // Get device status
 public boolean getStatus() {
     return status;
 }

 // Protected firmware log (secured)
 protected void firmwareLog() {
     System.out.println("Firmware updated for device " + deviceId);
 }
}

