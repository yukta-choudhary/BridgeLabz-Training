package com.day3.smartcheckout;

import java.util.HashMap;
import java.util.Scanner;

public class SmartCheckout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create price and stock map
        HashMap<String, Item> itemsMap = new HashMap<>();
        itemsMap.put("Milk", new Item("Milk", 50, 10));
        itemsMap.put("Bread", new Item("Bread", 30, 20));
        itemsMap.put("Eggs", new Item("Eggs", 5, 50));

        CustomerQueue queue = new CustomerQueue();

        while (true) {
            System.out.println("\n1. Add Customer\n2. Serve Customer\n3. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter customer name: ");
                String name = sc.nextLine();
                System.out.print("Number of items to buy: ");
                int count = sc.nextInt();
                sc.nextLine();
                Customer c = new Customer(name, count);

                for (int i = 0; i < count; i++) {
                    System.out.print("Enter item " + (i + 1) + ": ");
                    c.items[i] = sc.nextLine();
                }
                queue.enqueue(c);

            } else if (choice == 2) {
                if (queue.isEmpty()) {
                    System.out.println("No customers in queue.");
                    continue;
                }
                Customer c = queue.dequeue();
                int total = 0;
                System.out.println("\nServing customer: " + c.name);
                for (String itemName : c.items) {
                    if (itemsMap.containsKey(itemName)) {
                        Item item = itemsMap.get(itemName);
                        if (item.stock > 0) {
                            total += item.price;
                            item.stock--; // reduce stock
                            System.out.println(itemName + " - Rs." + item.price + " (Stock left: " + item.stock + ")");
                        } else {
                            System.out.println(itemName + " - Out of stock!");
                        }
                    } else {
                        System.out.println(itemName + " - Not available!");
                    }
                }
                System.out.println("Total Bill: Rs." + total);

            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
