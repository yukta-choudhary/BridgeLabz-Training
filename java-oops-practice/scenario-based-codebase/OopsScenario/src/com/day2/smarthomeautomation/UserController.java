package com.day2.smarthomeautomation;

//UserController.java
public class UserController {

 public void controlDevice(Controllable device, boolean power) {
     if (power) {
         device.turnOn();   // polymorphism
     } else {
         device.turnOff();
     }
 }

 public void compareEnergy(Appliance a1, Appliance a2) {
     if (a1.getPowerUsage() > a2.getPowerUsage()) {
         System.out.println(a1.name + " uses more power than " + a2.name);
     } else if (a1.getPowerUsage() < a2.getPowerUsage()) {
         System.out.println(a2.name + " uses more power than " + a1.name);
     } else {
         System.out.println("Both use equal power");
     }
 }
}
