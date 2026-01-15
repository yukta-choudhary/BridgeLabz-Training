package com.day9.homenest;
//Smart lock device class
public class Lock extends Device {

 public Lock(int deviceId) {
     super(deviceId);
 }

 // Polymorphism
 public void reset() {
     System.out.println("Lock reset and secured");
 }
}

