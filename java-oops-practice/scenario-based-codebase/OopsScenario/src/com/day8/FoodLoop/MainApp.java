package com.day8.FoodLoop;

import java.util.Scanner;

//Main class
public class MainApp
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);

     Order order = new Order(3);

     VegItem v1 = new VegItem("Paneer Burger", 200, 5);
     NonVegItem n1 = new NonVegItem("Chicken Pizza", 350, 3);

     order.addItem(v1);
     order.addItem(n1);

     System.out.println("1. Place Order");
     System.out.println("2. Cancel Order");

     int choice = sc.nextInt();

     if(choice == 1)
     {
         order.placeOrder();
     }
     else
     {
         order.cancelOrder();
     }
 }
}

