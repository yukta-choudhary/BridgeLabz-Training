package com.circularlinkedlist.taskscheduler;

//Circular Linked List for Task Scheduler

class TaskCircularLinkedList {
 TaskNode head;
 TaskNode current;

 // Add task at beginning
 void addAtBeginning(int id, String name, int p, String date) {
     TaskNode newNode = new TaskNode(id, name, p, date);

     if (head == null) {
         head = current = newNode;
         return;
     }

     TaskNode temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     newNode.next = head;
     temp.next = newNode;
     head = newNode;
 }

 // Add task at end
 void addAtEnd(int id, String name, int p, String date) {
     TaskNode newNode = new TaskNode(id, name, p, date);

     if (head == null) {
         head = current = newNode;
         return;
     }

     TaskNode temp = head;
     while (temp.next != head) {
         temp = temp.next;
     }

     temp.next = newNode;
     newNode.next = head;
 }

 // Add task at specific position
 void addAtPosition(int pos, int id, String name, int p, String date) {
     if (pos == 1) {
         addAtBeginning(id, name, p, date);
         return;
     }

     TaskNode temp = head;
     for (int i = 1; i < pos - 1 && temp.next != head; i++) {
         temp = temp.next;
     }

     TaskNode newNode = new TaskNode(id, name, p, date);
     newNode.next = temp.next;
     temp.next = newNode;
 }

 // Remove task by ID
 void removeById(int id) {
     if (head == null) {
         System.out.println("No tasks");
         return;
     }

     // Single node case
     if (head.taskId == id && head.next == head) {
         head = current = null;
         System.out.println("Task removed");
         return;
     }

     TaskNode temp = head;
     TaskNode prev = null;

     do {
         if (temp.taskId == id) {

             if (temp == head) {
                 TaskNode last = head;
                 while (last.next != head) {
                     last = last.next;
                 }
                 head = head.next;
                 last.next = head;
             } else {
                 prev.next = temp.next;
             }

             System.out.println("Task removed");
             return;
         }

         prev = temp;
         temp = temp.next;

     } while (temp != head);

     System.out.println("Task not found");
 }

 // View current task and move to next
 void viewNextTask() {
     if (current == null) {
         System.out.println("No tasks");
         return;
     }

     System.out.println(
         current.taskId + " " +
         current.taskName + " " +
         current.priority + " " +
         current.dueDate
     );

     current = current.next;
 }

 // Display all tasks
 void displayAll() {
     if (head == null) {
         System.out.println("No tasks");
         return;
     }

     TaskNode temp = head;
     do {
         System.out.println(
             temp.taskId + " " +
             temp.taskName + " " +
             temp.priority + " " +
             temp.dueDate
         );
         temp = temp.next;
     } while (temp != head);
 }

 // Search task by priority
 void searchByPriority(int p) {
     if (head == null) {
         System.out.println("No tasks");
         return;
     }

     TaskNode temp = head;
     boolean found = false;

     do {
         if (temp.priority == p) {
             System.out.println(
                 temp.taskId + " " +
                 temp.taskName + " " +
                 temp.priority + " " +
                 temp.dueDate
             );
             found = true;
         }
         temp = temp.next;
     } while (temp != head);

     if (!found)
         System.out.println("No task with given priority");
 }
}
