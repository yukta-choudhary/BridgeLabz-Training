package com.day6.artexpo;

//Sort artists by registration time using Insertion Sort

import java.util.Scanner;

public class ArtExpo {

 // Insertion sort
 static void sortArtists(Artist[] arr, int n) {

     for (int i = 1; i < n; i++) {
         Artist key = arr[i];
         int j = i - 1;

         while (j >= 0 && arr[j].time > key.time) {
             arr[j + 1] = arr[j];
             j--;
         }
         arr[j + 1] = key;
     }
 }

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter number of artists: ");
     int n = sc.nextInt();

     Artist[] artists = new Artist[n];

     for (int i = 0; i < n; i++) {
         System.out.print("Enter artist name: ");
         String name = sc.next();
         System.out.print("Enter registration time: ");
         int time = sc.nextInt();

         artists[i] = new Artist(name, time);
     }

     sortArtists(artists, n);

     System.out.println("\nArtists sorted by registration time:");
     for (int i = 0; i < n; i++) {
         System.out.println(artists[i].name + " - " + artists[i].time);
     }

     sc.close();
 }
}
