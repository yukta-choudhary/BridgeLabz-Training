package com.day4.swiftcart;

import java.util.*;

//Cart class
public class Cart implements ICheckout {

 private List<Product> products;     // protected list
 private double totalPrice;           // private price

 // Default constructor
 public Cart() {
     products = new ArrayList<>();
     totalPrice = 0;
 }

 // Constructor with pre-selected items
 public Cart(List<Product> products) {
     this.products = products;
     calculateTotal();
 }

 // Only Cart can update price
 private void calculateTotal() {
     totalPrice = 0;

     for (Product p : products) {
         totalPrice = totalPrice + p.price; // + operator
     }
 }

 // Add product
 public void addProduct(Product p) {
     products.add(p);
     calculateTotal();
 }

 // Apply discount using polymorphism
 public void applyDiscount() {
     for (Product p : products) {
         totalPrice = p.applyDiscount(totalPrice);
     }
 }

 // Generate bill
 public void generateBill() {
     System.out.println("Total Bill Amount: " + totalPrice);
 }
}
