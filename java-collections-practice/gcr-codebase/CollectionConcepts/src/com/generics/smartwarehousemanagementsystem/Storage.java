package com.generics.smartwarehousemanagementsystem;

//Generic storage class
//T must extend WarehouseItem

class Storage<T extends WarehouseItem> {

 T item;

 // Store item
 void setItem(T item) {
     this.item = item;
 }

 // Get item
 T getItem() {
     return item;
 }
}

