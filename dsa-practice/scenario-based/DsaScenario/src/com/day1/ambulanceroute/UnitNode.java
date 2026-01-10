package com.day1.ambulanceroute;

//UnitNode.java
public class UnitNode {

 String unitName;
 boolean available;
 UnitNode next;

 UnitNode(String unitName, boolean available) {
     this.unitName = unitName;
     this.available = available;
     this.next = null;
 }
}

