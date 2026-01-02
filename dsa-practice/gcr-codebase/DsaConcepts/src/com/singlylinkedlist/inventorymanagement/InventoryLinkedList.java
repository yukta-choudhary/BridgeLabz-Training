package com.singlylinkedlist.inventorymanagement;

//Singly Linked List for Inventory Management

class InventoryLinkedList {
 ItemNode head;

 // Add item at beginning
 void addAtBeginning(int id, String name, int qty, double price) {
     ItemNode newNode = new ItemNode(id, name, qty, price);
     newNode.next = head;
     head = newNode;
 }

 // Add item at end
 void addAtEnd(int id, String name, int qty, double price) {
     ItemNode newNode = new ItemNode(id, name, qty, price);

     if (head == null) {
         head = newNode;
         return;
     }

     ItemNode temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }
     temp.next = newNode;
 }

 // Add item at specific position
 void addAtPosition(int pos, int id, String name, int qty, double price) {
     if (pos == 1) {
         addAtBeginning(id, name, qty, price);
         return;
     }

     ItemNode temp = head;
     for (int i = 1; i < pos - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null) {
         System.out.println("Invalid position");
         return;
     }

     ItemNode newNode = new ItemNode(id, name, qty, price);
     newNode.next = temp.next;
     temp.next = newNode;
 }

 // Remove item by ID
 void removeById(int id) {
     if (head == null) {
         System.out.println("Inventory empty");
         return;
     }

     if (head.itemId == id) {
         head = head.next;
         System.out.println("Item removed");
         return;
     }

     ItemNode temp = head;
     while (temp.next != null && temp.next.itemId != id) {
         temp = temp.next;
     }

     if (temp.next == null) {
         System.out.println("Item not found");
     } else {
         temp.next = temp.next.next;
         System.out.println("Item removed");
     }
 }

 // Update quantity by ID
 void updateQuantity(int id, int newQty) {
     ItemNode temp = head;

     while (temp != null) {
         if (temp.itemId == id) {
             temp.quantity = newQty;
             System.out.println("Quantity updated");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Item not found");
 }

 // Search by ID
 void searchById(int id) {
     ItemNode temp = head;

     while (temp != null) {
         if (temp.itemId == id) {
             displayItem(temp);
             return;
         }
         temp = temp.next;
     }
     System.out.println("Item not found");
 }

 // Search by Name
 void searchByName(String name) {
     ItemNode temp = head;

     while (temp != null) {
         if (temp.itemName.equalsIgnoreCase(name)) {
             displayItem(temp);
             return;
         }
         temp = temp.next;
     }
     System.out.println("Item not found");
 }

 // Calculate total inventory value
 void totalValue() {
     double total = 0;
     ItemNode temp = head;

     while (temp != null) {
         total += temp.price * temp.quantity;
         temp = temp.next;
     }

     System.out.println("Total Inventory Value = " + total);
 }

 // Sort by Item Name (Ascending / Descending)
 void sortByName(boolean asc) {
     if (head == null) return;

     for (ItemNode i = head; i.next != null; i = i.next) {
         for (ItemNode j = i.next; j != null; j = j.next) {
             if ((asc && i.itemName.compareTo(j.itemName) > 0) ||
                 (!asc && i.itemName.compareTo(j.itemName) < 0)) {
                 swapData(i, j);
             }
         }
     }
     System.out.println("Sorted by name");
 }

 // Sort by Price (Ascending / Descending)
 void sortByPrice(boolean asc) {
     if (head == null) return;

     for (ItemNode i = head; i.next != null; i = i.next) {
         for (ItemNode j = i.next; j != null; j = j.next) {
             if ((asc && i.price > j.price) ||
                 (!asc && i.price < j.price)) {
                 swapData(i, j);
             }
         }
     }
     System.out.println("Sorted by price");
 }

 // Swap item data
 void swapData(ItemNode a, ItemNode b) {
     int id = a.itemId;
     String name = a.itemName;
     int qty = a.quantity;
     double price = a.price;

     a.itemId = b.itemId;
     a.itemName = b.itemName;
     a.quantity = b.quantity;
     a.price = b.price;

     b.itemId = id;
     b.itemName = name;
     b.quantity = qty;
     b.price = price;
 }

 // Display all items
 void displayAll() {
     if (head == null) {
         System.out.println("No items");
         return;
     }

     ItemNode temp = head;
     while (temp != null) {
         displayItem(temp);
         temp = temp.next;
     }
 }

 // Display single item
 void displayItem(ItemNode item) {
     System.out.println(
         item.itemId + " " +
         item.itemName + " " +
         item.quantity + " " +
         item.price
     );
 }
}
