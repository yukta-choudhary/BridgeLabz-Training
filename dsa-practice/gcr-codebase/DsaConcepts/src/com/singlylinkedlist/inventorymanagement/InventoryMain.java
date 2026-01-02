package com.singlylinkedlist.inventorymanagement;

//Main class for Inventory Management System

import java.util.Scanner;

public class InventoryMain {
 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     InventoryLinkedList list = new InventoryLinkedList();
     int choice;

     do {
         System.out.println(
             "\n1.Add Begin\n2.Add End\n3.Add Position\n4.Remove\n5.Update Qty" +
             "\n6.Search ID\n7.Search Name\n8.Total Value\n9.Sort Name Asc" +
             "\n10.Sort Name Desc\n11.Sort Price Asc\n12.Sort Price Desc\n13.Display\n0.Exit"
         );

         choice = sc.nextInt();

         switch (choice) {
             case 1:
                 list.addAtBeginning(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble());
                 break;

             case 2:
                 list.addAtEnd(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble());
                 break;

             case 3:
                 list.addAtPosition(sc.nextInt(), sc.nextInt(), sc.next(), sc.nextInt(), sc.nextDouble());
                 break;

             case 4:
                 list.removeById(sc.nextInt());
                 break;

             case 5:
                 list.updateQuantity(sc.nextInt(), sc.nextInt());
                 break;

             case 6:
                 list.searchById(sc.nextInt());
                 break;

             case 7:
                 list.searchByName(sc.next());
                 break;

             case 8:
                 list.totalValue();
                 break;

             case 9:
                 list.sortByName(true);
                 break;

             case 10:
                 list.sortByName(false);
                 break;

             case 11:
                 list.sortByPrice(true);
                 break;

             case 12:
                 list.sortByPrice(false);
                 break;

             case 13:
                 list.displayAll();
                 break;
         }
     } while (choice != 0);

     sc.close();
 }
}
