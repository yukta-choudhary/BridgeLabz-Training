package com.day8.FoodLoop;

//Order class
public class Order implements IOrderable
{
 FoodItem[] items;
 int count;
 double totalAmount;

 public Order(int size)
 {
     items = new FoodItem[size];
     count = 0;
     totalAmount = 0;
 }

 public void addItem(FoodItem item)
 {
     if(item.isAvailable())
     {
         items[count] = item;
         totalAmount = totalAmount + item.getPrice();  // Operator usage
         count++;
     }
 }

 // Polymorphism through logic
 public void applyDiscount()
 {
     if(totalAmount > 500)
     {
         totalAmount = totalAmount - 100;
     }
 }

 public void placeOrder()
 {
     applyDiscount();
     System.out.println("Order placed successfully");
     System.out.println("Total amount: " + totalAmount);
 }

 public void cancelOrder()
 {
     System.out.println("Order cancelled");
 }
}

