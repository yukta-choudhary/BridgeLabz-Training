package com.day10.ecommerceproductinventory;

import java.util.Scanner;

//Main class
public class InventorySystem {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     ProductBST bst = new ProductBST();
     int choice;

     do {
         System.out.println("\n1.Add 2.Search 3.Update Price 4.Display 5.Exit");
         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 // Add product
                 System.out.print("Enter SKU: ");
                 int sku = sc.nextInt();
                 sc.nextLine();
                 System.out.print("Enter name: ");
                 String name = sc.nextLine();
                 System.out.print("Enter price: ");
                 double price = sc.nextDouble();
                 bst.root = bst.insert(bst.root, sku, name, price);
                 break;

             case 2:
                 // Search product
                 System.out.print("Enter SKU to search: ");
                 sku = sc.nextInt();
                 bst.search(bst.root, sku);
                 break;

             case 3:
                 // Update price
                 System.out.print("Enter SKU: ");
                 sku = sc.nextInt();
                 System.out.print("Enter new price: ");
                 price = sc.nextDouble();
                 bst.updatePrice(bst.root, sku, price);
                 break;

             case 4:
                 // Display sorted products
                 System.out.println("Products (Sorted by SKU):");
                 bst.inorder(bst.root);
                 break;

             case 5:
                 System.out.println("Exit");
                 break;

             default:
                 System.out.println("Invalid choice");
         }
     } while (choice != 5);

     sc.close();
 }
}
