package com.day8.Artify;
import java.util.Scanner;

//Main class
public class MainApp
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter user name: ");
     String name = sc.nextLine();

     System.out.print("Enter wallet balance: ");
     double balance = sc.nextDouble();

     User user = new User(name, balance);

     System.out.println("Choose Art Type:");
     System.out.println("1. Digital Art");
     System.out.println("2. Print Art");

     int choice = sc.nextInt();

     Artwork art;

     if(choice == 1)
     {
         art = new DigitalArt("Sunset", "Asha", 500);
     }
     else
     {
         art = new PrintArt("Mountain", "Ravi", 700);
     }

     art.showDetails();
     art.purchase(user);
     art.license();

     System.out.println("Remaining Wallet Balance: " + user.walletBalance);
 }
}
