package com.encapsulation.onlinefooddelivery;

//Non-veg food item
public class NonVegItem extends FoodItem implements Discountable {

 public NonVegItem(String name, double price, int qty) {
     super(name, price, qty);
 }

 // Extra non-veg charge added
 @Override
 public double calculateTotalPrice() {
     double base = getPrice() * getQuantity();
     return base + 50; // extra charge
 }

 // 5% discount
 @Override
 public double applyDiscount(double amount) {
     return amount * 0.05;
 }

 @Override
 public String getDiscountDetails() {
     return "5% Non-Veg Discount";
 }
}
