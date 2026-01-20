package com.day12.addressbooksystem;

//AddressBook class
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddressBook {

 private ArrayList<Contact> contacts = new ArrayList<>();

 // Add contact with duplicate check
 public void addContact(Contact c) {
     for (Contact con : contacts) {
         if (con.getFirstName().equalsIgnoreCase(c.getFirstName())) {
             System.out.println("Duplicate contact found!");
             return;
         }
     }
     contacts.add(c);
     System.out.println("Contact added successfully.");
 }

 // Edit contact by first name
 public void editContact(String name, String phone, String email) {
     for (Contact c : contacts) {
         if (c.getFirstName().equalsIgnoreCase(name)) {
             c.setPhone(phone);
             c.setEmail(email);
             System.out.println("Contact updated.");
             return;
         }
     }
     System.out.println("Contact not found.");
 }

 // Delete contact
 public void deleteContact(String name) {
     for (Contact c : contacts) {
         if (c.getFirstName().equalsIgnoreCase(name)) {
             contacts.remove(c);
             System.out.println("Contact deleted.");
             return;
         }
     }
     System.out.println("Contact not found.");
 }

 // Search by city or state
 public void searchByLocation(String value) {
     for (Contact c : contacts) {
         if (c.getAddress().getCity().equalsIgnoreCase(value) ||
             c.getAddress().getState().equalsIgnoreCase(value)) {
             c.display();
         }
     }
 }

 // Display sorted contacts
 public void displaySorted() {
     Collections.sort(contacts, Comparator.comparing(Contact::getFirstName));
     for (Contact c : contacts) {
         c.display();
     }
 }
}

