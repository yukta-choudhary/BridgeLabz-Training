package com.generics.smartwarehousemanagementsystem;

import java.util.List;

//Utility class with wildcard method

class WarehouseUtility {

 // Wildcard method to display all items
 static void displayItems(List<? extends WarehouseItem> items) {
     for (WarehouseItem item : items) {
         item.showItem();
     }
 }
}
