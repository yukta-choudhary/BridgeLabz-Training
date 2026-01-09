package com.day8.FoodLoop;

//Parent class
public class FoodItem
{
 private String name;
 private String category;
 private double price;
 private int availability;   // Encapsulation

 public FoodItem(String name, String category, double price, int availability)
 {
     this.name = name;
     this.category = category;
     this.price = price;
     this.availability = availability;
 }

 public double getPrice()
 {
     return price;
 }

 public boolean isAvailable()
 {
     return availability > 0;
 }
}
