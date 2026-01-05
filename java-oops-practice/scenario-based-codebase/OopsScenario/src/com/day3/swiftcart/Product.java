package com.day3.swiftcart;

//Base Product class
public class Product {

 protected String name;
 protected double price;
 protected String category;

 // Constructor
 public Product(String name, double price, String category) {
     this.name = name;
     this.price = price;
     this.category = category;
 }

 // Method to apply discount (to be overridden)
 public double applyDiscount(double total) {
     return total; // no discount
 }
}
