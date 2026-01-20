package com.day12.addressbooksystem;
//Contact class
public class Contact {

 private String firstName;
 private String lastName;
 private String phone;
 private String email;
 private Address address;

 // Constructor
 public Contact(String firstName, String lastName, String phone,
                String email, Address address) {
     this.firstName = firstName;
     this.lastName = lastName;
     this.phone = phone;
     this.email = email;
     this.address = address;
 }

 // Getters
 public String getFirstName() {
     return firstName;
 }

 public Address getAddress() {
     return address;
 }

 // Setters for edit
 public void setPhone(String phone) {
     this.phone = phone;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 // Display contact
 public void display() {
     System.out.println(firstName + " " + lastName);
     System.out.println("Phone: " + phone);
     System.out.println("Email: " + email);
     System.out.println("Address: " + address);
     System.out.println("-------------------");
 }
}

