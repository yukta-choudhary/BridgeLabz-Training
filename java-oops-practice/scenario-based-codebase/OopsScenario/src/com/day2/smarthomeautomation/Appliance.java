package com.day2.smarthomeautomation;

//Appliance
public class Appliance {
 protected String name;
 private boolean isOn;        // internal state (private)
 private int powerUsage;      // in  watts

 // Default power setting
 public Appliance(String name) {
     this.name = name;
     this.powerUsage = 50;
     this.isOn = false;
 }

 // User-defined power setting
 public Appliance(String name, int powerUsage) {
     this.name = name;
     this.powerUsage = powerUsage;
     this.isOn = false;
 }

 // Public toggle methods
 public void switchOn() {
     isOn = true;
 }

 public void switchOff() {
     isOn = false;
 }

 // Getter
 public int getPowerUsage() {
     return powerUsage;
 }
}
