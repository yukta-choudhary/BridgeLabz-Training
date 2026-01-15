package com.day9.homenest;
//Main class
import java.util.Scanner;

public class HomeNest {

 // Main method
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter Device ID: ");
     int id = sc.nextInt();

     // Creating objects
     Device light = new Light(id);
     Device cam = new Camera(id + 1);
     Device thermo = new Thermostat(id + 2);
     Device lock = new Lock(id + 3);

     // Using polymorphism
     light.turnOn();
     light.reset();

     cam.turnOn();
     cam.reset();

     thermo.turnOn();
     thermo.reset();

     lock.turnOn();
     lock.reset();

     sc.close();
 }
}

