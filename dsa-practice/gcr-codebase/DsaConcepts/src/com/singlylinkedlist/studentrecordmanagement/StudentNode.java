package com.singlylinkedlist.studentrecordmanagement;

//Node class for Singly Linked List

class StudentNode {
 int rollNo;
 String name;
 int age;
 char grade;
 StudentNode next;

 // Constructor
 StudentNode(int rollNo, String name, int age, char grade) {
     this.rollNo = rollNo;
     this.name = name;
     this.age = age;
     this.grade = grade;
     this.next = null;
 }
}
