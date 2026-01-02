package com.day2.hospitalpatientmanagement;

//HospitalMain.java
public class HospitalMain {
 public static void main(String[] args) {

     Patient p1 = new InPatient(101, "Rahul", 30, 5);
     Patient p2 = new OutPatient(102, "Anita", 25);

     Doctor d1 = new Doctor(201, "Dr. Sharma", "Cardiology");

     Bill bill = new Bill(1000, 100, 200);

     p1.displayInfo();
     p2.displayInfo();
     d1.displayInfo();

     System.out.println("Total Bill Amount: " + bill.calculatePayment());
 }
}
