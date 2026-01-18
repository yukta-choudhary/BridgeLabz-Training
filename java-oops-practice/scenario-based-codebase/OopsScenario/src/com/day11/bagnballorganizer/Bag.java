package com.day11.bagnballorganizer;
//Represents a Bag containing Balls, implements Storable

public class Bag implements Storable {

 private String id;
 private String color;
 private int capacity;
 private Ball[] balls;
 private int count; // number of balls currently

 public Bag(String id, String color, int capacity) {
     this.id = id;
     this.color = color;
     this.capacity = capacity;
     this.balls = new Ball[capacity];
     this.count = 0;
 }

 public String getId() { return id; }
 public String getColor() { return color; }
 public int getCapacity() { return capacity; }
 public int getBallCount() { return count; }

 // Add a ball to the bag
 public void addBall(Ball b) {
     if (count < capacity) {
         balls[count] = b;
         count++;
         System.out.println("Ball added to Bag " + id);
     } else {
         System.out.println("Bag " + id + " is full. Cannot add more balls.");
     }
 }

 // Remove a ball by ID
 public void removeBall(String ballId) {
     int i;
     for (i = 0; i < count; i++) {
         if (balls[i].getId().equals(ballId)) {
             break;
         }
     }

     if (i == count) {
         System.out.println("Ball not found in Bag " + id);
         return;
     }

     // Shift remaining balls
     for (int j = i; j < count - 1; j++) {
         balls[j] = balls[j + 1];
     }
     balls[count - 1] = null;
     count--;
     System.out.println("Ball removed from Bag " + id);
 }

 // Display balls in bag
 public void displayBalls() {
     if (count == 0) {
         System.out.println("Bag " + id + " has no balls.");
         return;
     }
     System.out.println("Balls in Bag " + id + ":");
     for (int i = 0; i < count; i++) {
         balls[i].displayInfo();
     }
 }

 @Override
 public void displayInfo() {
     System.out.println("Bag ID: " + id + ", Color: " + color + ", Capacity: " + capacity + ", Balls: " + count);
 }
}

