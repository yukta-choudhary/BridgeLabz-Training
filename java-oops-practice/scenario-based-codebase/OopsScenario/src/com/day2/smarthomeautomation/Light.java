package com.day2.smarthomeautomation;

//Light
public class Light extends Appliance implements Controllable {

 public Light(String name) {
     super(name, 20);
 }

 @Override
 public void turnOn() {
     switchOn();
     System.out.println(name + " light is ON (Soft brightness)");
 }

 @Override
 public void turnOff() {
     switchOff();
     System.out.println(name + " light is OFF");
 }
}

