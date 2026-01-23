package com.day10.universitydigitalrecordsystem;
//Node class for BST
class StudentNode {
 int roll;
 String name;
 StudentNode left, right;

 // Constructor
 StudentNode(int roll, String name) {
     this.roll = roll;
     this.name = name;
     left = right = null;
 }
}

