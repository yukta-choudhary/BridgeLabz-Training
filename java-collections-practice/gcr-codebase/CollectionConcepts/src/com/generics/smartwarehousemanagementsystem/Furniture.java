package com.generics.smartwarehousemanagementsystem;
//Furniture item class

class Furniture extends WarehouseItem {

 Furniture(String name) {
     super(name);
 }

 // Override method
 void showItem() {
     System.out.println("Furniture Item: " + name);
 }
}
