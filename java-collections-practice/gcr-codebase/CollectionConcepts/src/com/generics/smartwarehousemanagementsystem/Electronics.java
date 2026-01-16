package com.generics.smartwarehousemanagementsystem;
//Electronics item class

class Electronics extends WarehouseItem {

 Electronics(String name) {
     super(name);
 }

 // Override method
 void showItem() {
     System.out.println("Electronics Item: " + name);
 }
}
