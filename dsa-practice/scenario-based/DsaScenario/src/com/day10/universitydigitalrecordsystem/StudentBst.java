package com.day10.universitydigitalrecordsystem;

//BST operations class
class StudentBst {
 StudentNode root;

 // Insert student
 StudentNode insert(StudentNode root, int roll, String name) {
     if (root == null) {
         return new StudentNode(roll, name);
     }

     if (roll < root.roll) {
         root.left = insert(root.left, roll, name);
     } else if (roll > root.roll) {
         root.right = insert(root.right, roll, name);
     }

     return root;
 }

 // Search student
 void search(StudentNode root, int roll) {
     if (root == null) {
         System.out.println("Student not found");
         return;
     }

     if (roll == root.roll) {
         System.out.println("Found: " + root.roll + " " + root.name);
     } else if (roll < root.roll) {
         search(root.left, roll);
     } else {
         search(root.right, roll);
     }
 }

 // Find minimum value node
 StudentNode findMin(StudentNode root) {
     while (root.left != null) {
         root = root.left;
     }
     return root;
 }

 // Delete student
 StudentNode delete(StudentNode root, int roll) {
     if (root == null) return null;

     if (roll < root.roll) {
         root.left = delete(root.left, roll);
     } else if (roll > root.roll) {
         root.right = delete(root.right, roll);
     } else {
         // Case 1 & 2
         if (root.left == null) return root.right;
         if (root.right == null) return root.left;

         // Case 3
         StudentNode temp = findMin(root.right);
         root.roll = temp.roll;
         root.name = temp.name;
         root.right = delete(root.right, temp.roll);
     }
     return root;
 }

 // Inorder traversal (sorted order)
 void inorder(StudentNode root) {
     if (root != null) {
         inorder(root.left);
         System.out.println(root.roll + " - " + root.name);
         inorder(root.right);
     }
 }
}
