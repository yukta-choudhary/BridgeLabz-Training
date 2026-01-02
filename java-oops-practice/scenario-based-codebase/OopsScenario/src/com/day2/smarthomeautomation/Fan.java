package com.day2.smarthomeautomation;

//Fan
public class Fan extends Appliance implements Controllable {

 public Fan(String name) {
     super(name, 70);
 }

 @Override
 public void turnOn() {
     switchOn();
     System.out.println(name + " fan is ON (Medium speed)");
 }

 @Override
 public void turnOff() {
     switchOff();
     System.out.println(name + " fan is OFF");
 }
}
