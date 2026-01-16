package com.generics.onlinemarketplace;
import java.util.Scanner;

//Question: Dynamic Online Marketplace using Generics

public class Marketplace {

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     System.out.print("Enter book name: ");
     String bName = sc.nextLine();

     System.out.print("Enter book price: ");
     double bPrice = sc.nextDouble();
     sc.nextLine();

     Product<BookCategory> book =
             new Product<>(bName, bPrice, new BookCategory());

     System.out.print("\nEnter clothing name: ");
     String cName = sc.nextLine();

     System.out.print("Enter clothing price: ");
     double cPrice = sc.nextDouble();

     Product<ClothingCategory> cloth =
             new Product<>(cName, cPrice, new ClothingCategory());

     System.out.println("\n--- Before Discount ---");
     book.showProduct();
     System.out.println();
     cloth.showProduct();

     System.out.println("\nApplying 10% discount...");
     DiscountUtility.applyDiscount(book, 10);
     DiscountUtility.applyDiscount(cloth, 10);

     System.out.println("\n--- After Discount ---");
     book.showProduct();
     System.out.println();
     cloth.showProduct();

     sc.close();
 }
}

