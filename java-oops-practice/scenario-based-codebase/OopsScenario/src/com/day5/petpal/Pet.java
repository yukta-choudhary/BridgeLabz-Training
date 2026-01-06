package com.day5.petpal;

//Base Pet class
public class Pet {

 String name;
 String type;
 int age;

 private int hunger; // encapsulated
 private int mood;   // encapsulated

 // Constructor with random values
 Pet(String name, String type, int age) {
     this.name = name;
     this.type = type;
     this.age = age;
     hunger = 5;
     mood = 5;
 }

 // Feed pet
 void reduceHunger() {
     hunger--;
 }

 // Improve mood
 void improveMood() {
     mood++;
 }

 // Sleep increases mood
 void rest() {
     mood += 2;
 }

 // Display status
 void showStatus() {
     System.out.println("Hunger Level: " + hunger);
     System.out.println("Mood Level: " + mood);
 }

 // Polymorphism
 void makeSound() {
     System.out.println("Pet makes sound");
 }
}

