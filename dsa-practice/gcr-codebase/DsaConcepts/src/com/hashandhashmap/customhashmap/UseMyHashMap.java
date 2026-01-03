package com.hashandhashmap.customhashmap;

import java.util.Scanner;

//Main class
public class UseMyHashMap {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);
     MyHashMap map = new MyHashMap();

     System.out.print("Enter number of operations: ");
     int n = sc.nextInt();

     for (int i = 0; i < n; i++) {

         System.out.println("1.Put  2.Get  3.Remove");
         int choice = sc.nextInt();

         if (choice == 1) {
             System.out.print("Enter key: ");
             int k = sc.nextInt();
             System.out.print("Enter value: ");
             int v = sc.nextInt();
             map.put(k, v);
         }
         else if (choice == 2) {
             System.out.print("Enter key: ");
             int k = sc.nextInt();
             int res = map.get(k);
             if (res == -1) {
                 System.out.println("Key not found");
             } else {
                 System.out.println("Value: " + res);
             }
         }
         else if (choice == 3) {
             System.out.print("Enter key: ");
             int k = sc.nextInt();
             map.remove(k);
             System.out.println("Key removed if existed");
         }
     }

     sc.close();
 }
}
