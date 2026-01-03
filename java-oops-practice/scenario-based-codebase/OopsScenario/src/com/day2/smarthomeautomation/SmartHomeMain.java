package com.day2.smarthomeautomation;

//SmartHomeMain
public class SmartHomeMain {
 public static void main(String[] args) {

     Light light = new Light("Kitche");
     Fan fan = new Fan("Bedroom");
     Ac ac = new Ac("Bedroom", 1500);

     UserController controller = new UserController();

     controller.controlDevice(light, true);
     controller.controlDevice(fan, true);
     controller.controlDevice(ac, true);

     controller.compareEnergy(fan, ac);
 }
}
