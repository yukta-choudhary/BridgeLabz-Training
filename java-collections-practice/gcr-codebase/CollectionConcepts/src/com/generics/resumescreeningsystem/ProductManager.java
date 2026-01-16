package com.generics.resumescreeningsystem;

//Product Manager role

class ProductManager extends JobRole {

 ProductManager(String name) {
     super(name);
 }

 // Override method
 void screenResume() {
     System.out.println(candidateName + " screened for Product Manager role");
 }
}

