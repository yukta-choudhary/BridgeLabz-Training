package com.day3.swiftcart;
//Perishable product class
public class PerishableProduct extends Product {

 // Constructor
 public PerishableProduct(String name, double price, String category) {
     super(name, price, category);
 }

 // Polymorphism: higher discount
 @Override
 public double applyDiscount(double total) {
     return total - 50; // flat discount
 }
}
