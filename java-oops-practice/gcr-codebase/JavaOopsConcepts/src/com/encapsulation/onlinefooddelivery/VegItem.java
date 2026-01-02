package com.encapsulation.onlinefooddelivery;

//Veg food item
public class VegItem extends FoodItem implements Discountable {

 public VegItem(String name, double price, int qty) {
     super(name, price, qty);
 }

 // No extra charges
 @Override
 public double calculateTotalPrice() {
     return getPrice() * getQuantity();
 }

 // 10% discount
 @Override
 public double applyDiscount(double amount) {
     return amount * 0.10;
 }

 @Override
 public String getDiscountDetails() {
     return "10% Veg Discount";
 }
}
