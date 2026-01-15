package com.day10.birdsanctuary;

//Parent class
@DeveloperInfo(name = "EcoWing Team", version = "1.0")
public abstract class Bird {
 protected String name;
 protected String species;
 protected int id;

 public Bird(int id, String name, String species) {
     this.id = id;
     this.name = name;
     this.species = species;
 }

 public int getId() {
     return id;
 }

 public void eat() {
     System.out.println(name + " is eating.");
 }

 public void display() {
     System.out.println("ID: " + id + ", Name: " + name + ", Species: " + species);
 }
}

