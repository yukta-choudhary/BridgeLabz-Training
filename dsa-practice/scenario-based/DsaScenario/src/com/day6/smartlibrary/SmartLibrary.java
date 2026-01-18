package com.day6.smartlibrary;

//Insertion Sort to keep books alphabetically sorted

import java.util.Scanner;

public class SmartLibrary {

 // Insertion sort
 static void insertionSort(Book[] arr, int n) {

     for (int i = 1; i < n; i++) {

         Book key = arr[i];
         int j = i - 1;

         while (j >= 0 && arr[j].title.compareTo(key.title) > 0) {
             arr[j + 1] = arr[j];
             j--;
         }

         arr[j + 1] = key;
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of books: ");
     int n = sc.nextInt();

     Book[] books = new Book[n];

     for (int i = 0; i < n; i++) {
         System.out.print("Enter book title: ");
         books[i] = new Book(sc.next());
     }

     insertionSort(books, n);

     System.out.println("\nBooks sorted alphabetically:");
     for (int i = 0; i < n; i++) {
         System.out.println(books[i].title);
     }

     sc.close();
 }
}
