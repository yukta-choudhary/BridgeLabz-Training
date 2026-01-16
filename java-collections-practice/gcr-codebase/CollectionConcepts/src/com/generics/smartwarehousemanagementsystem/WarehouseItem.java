package com.generics.smartwarehousemanagementsystem;


abstract class WarehouseItem {
 String name;

 // Constructor
 WarehouseItem(String name) {
     this.name = name;
 }

 // Abstract method
 abstract void showItem();
}
