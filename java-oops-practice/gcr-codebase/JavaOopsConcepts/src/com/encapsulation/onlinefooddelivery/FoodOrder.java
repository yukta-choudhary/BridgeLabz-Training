package com.encapsulation.onlinefooddelivery;

//Main class to demonstrate polymorphism
public class FoodOrder {

 // Single order processing method
 public static void processOrder(FoodItem item) {

     item.getItemDetails();

     double total = item.calculateTotalPrice();
     double discount = 0;

     if (item instanceof Discountable) {
         Discountable d = (Discountable) item;
         discount = d.applyDiscount(total);
         System.out.println(d.getDiscountDetails());
     }

     double finalAmount = total - discount;

     System.out.println("Total Amount: " + total);
     System.out.println("Discount: " + discount);
     System.out.println("Final Payable: " + finalAmount);
     System.out.println("----------------------");
 }

 public static void main(String[] args) {

     // Polymorphic references
     FoodItem f1 = new VegItem("Paneer Pizza", 250, 2);
     FoodItem f2 = new NonVegItem("Chicken Burger", 180, 3);

     processOrder(f1);
     processOrder(f2);
 }
}
