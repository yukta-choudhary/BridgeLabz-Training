package com.generics.smartwarehousemanagementsystem;

//Groceries item class

class Groceries extends WarehouseItem {

 Groceries(String name) {
     super(name);
 }

 // Override method
 void showItem() {
     System.out.println("Grocery Item: " + name);
 }
}

