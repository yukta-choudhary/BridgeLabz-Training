package com.day4.swiftcart;

/*
Question:
SwiftCart – The Grocery Shopping App
*/

import java.util.*;

public class SwiftCart {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Cart cart = new Cart();

        System.out.println("Enter number of products:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Enter product name:");
            String name = sc.nextLine();

            System.out.println("Enter price:");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.println("Enter category:");
            String category = sc.nextLine();

            System.out.println("1. Perishable  2. Non-Perishable");
            int choice = sc.nextInt();
            sc.nextLine();

            Product p;

            if (choice == 1) {
                p = new PerishableProduct(name, price, category);
            } else {
                p = new NonPerishableProduct(name, price, category);
            }

            cart.addProduct(p);
        }

        // Apply discount
        cart.applyDiscount();

        // Generate bill
        cart.generateBill();

        sc.close();
    }
}
