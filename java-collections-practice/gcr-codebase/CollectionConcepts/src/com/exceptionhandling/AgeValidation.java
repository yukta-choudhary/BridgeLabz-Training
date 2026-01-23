package com.exceptionhandling;
import java.util.Scanner;

//Custom exception in same file
class InvalidAgeException extends Exception {
 InvalidAgeException(String msg) {
     super(msg);
 }
}

public class AgeValidation {

 // Method to validate age
 static void validateAge(int age) throws InvalidAgeException {
     if (age < 18)
         throw new InvalidAgeException("Age must be 18 or above");
     System.out.println("Access granted!");
 }

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.print("Enter age: ");
     int age = sc.nextInt();

     try {
         validateAge(age);
     } catch (InvalidAgeException e) {
         System.out.println(e.getMessage());
     }

     sc.close();
 }
}
