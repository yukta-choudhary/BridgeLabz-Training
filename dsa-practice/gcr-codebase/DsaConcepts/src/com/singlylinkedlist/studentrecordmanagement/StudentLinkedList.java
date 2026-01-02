package com.singlylinkedlist.studentrecordmanagement;

//Singly Linked List operations for Student records

class StudentLinkedList {
 StudentNode head;

 // Add at beginning
 void addAtBeginning(int r, String n, int a, char g) {
     StudentNode newNode = new StudentNode(r, n, a, g);
     newNode.next = head;
     head = newNode;
 }

 // Add at end
 void addAtEnd(int r, String n, int a, char g) {
     StudentNode newNode = new StudentNode(r, n, a, g);

     if (head == null) {
         head = newNode;
         return;
     }

     StudentNode temp = head;
     while (temp.next != null) {
         temp = temp.next;
     }
     temp.next = newNode;
 }

 // Add at specific position
 void addAtPosition(int pos, int r, String n, int a, char g) {
     if (pos == 1) {
         addAtBeginning(r, n, a, g);
         return;
     }

     StudentNode temp = head;
     for (int i = 1; i < pos - 1 && temp != null; i++) {
         temp = temp.next;
     }

     if (temp == null) {
         System.out.println("Invalid position");
         return;
     }

     StudentNode newNode = new StudentNode(r, n, a, g);
     newNode.next = temp.next;
     temp.next = newNode;
 }

 // Delete by roll number
 void deleteByRoll(int roll) {
     if (head == null) {
         System.out.println("List is empty");
         return;
     }

     if (head.rollNo == roll) {
         head = head.next;
         System.out.println("Student deleted");
         return;
     }

     StudentNode temp = head;
     while (temp.next != null && temp.next.rollNo != roll) {
         temp = temp.next;
     }

     if (temp.next == null) {
         System.out.println("Student not found");
     } else {
         temp.next = temp.next.next;
         System.out.println("Student deleted");
     }
 }

 // Search by roll number
 void searchByRoll(int roll) {
     StudentNode temp = head;

     while (temp != null) {
         if (temp.rollNo == roll) {
             System.out.println("Student Found");
             System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
             return;
         }
         temp = temp.next;
     }
     System.out.println("Student not found");
 }

 // Update grade
 void updateGrade(int roll, char newGrade) {
     StudentNode temp = head;

     while (temp != null) {
         if (temp.rollNo == roll) {
             temp.grade = newGrade;
             System.out.println("Grade updated");
             return;
         }
         temp = temp.next;
     }
     System.out.println("Student not found");
 }

 // Display all records
 void display() {
     if (head == null) {
         System.out.println("No records");
         return;
     }

     StudentNode temp = head;
     while (temp != null) {
         System.out.println(
             temp.rollNo + " " +
             temp.name + " " +
             temp.age + " " +
             temp.grade
         );
         temp = temp.next;
     }
 }
}
