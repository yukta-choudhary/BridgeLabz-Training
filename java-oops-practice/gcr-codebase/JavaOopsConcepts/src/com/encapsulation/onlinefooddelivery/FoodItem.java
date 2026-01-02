package com.encapsulation.onlinefooddelivery;

//Abstract class FoodItem
public abstract class FoodItem {

 // Encapsulated fields
 private String itemName;
 private double price;
 private int quantity;

 // Constructor
 public FoodItem(String itemName, double price, int quantity) {
     this.itemName = itemName;
     this.price = price;
     this.quantity = quantity;
 }

 // Getters and setters (controlled access)
 public String getItemName() {
     return itemName;
 }

 public double getPrice() {
     return price;
 }

 public void setPrice(double price) {
     if (price > 0) {
         this.price = price;
     }
 }

 public int getQuantity() {
     return quantity;
 }

 public void setQuantity(int quantity) {
     if (quantity > 0) {
         this.quantity = quantity;
     }
 }

 // Abstract method
 public abstract double calculateTotalPrice();

 // Concrete method
 public void getItemDetails() {
     System.out.println("Item: " + itemName);
     System.out.println("Price: " + price);
     System.out.println("Quantity: " + quantity);
 }
}
