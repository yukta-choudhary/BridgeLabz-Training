package com.day3.swiftcart;
//Non-perishable product class
public class NonPerishableProduct extends Product {

 // Constructor
 public NonPerishableProduct(String name, double price, String category) {
     super(name, price, category);
 }

 // Polymorphism: lower discount
 @Override
 public double applyDiscount(double total) {
     return total - 20; // flat discount
 }
}
