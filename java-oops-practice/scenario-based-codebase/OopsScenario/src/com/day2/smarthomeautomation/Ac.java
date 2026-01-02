package com.day2.smarthomeautomation;

//AC.java
public class Ac extends Appliance implements Controllable {

 public Ac(String name, int powerUsage) {
     super(name, powerUsage);
 }

 @Override
 public void turnOn() {
     switchOn();
     System.out.println(name + " AC is ON (Cooling mode)");
 }

 @Override
 public void turnOff() {
     switchOff();
     System.out.println(name + " AC is OFF");
 }
}
