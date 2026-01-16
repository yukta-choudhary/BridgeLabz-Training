package com.generics.resumescreeningsystem;

//Software Engineer role

class SoftwareEngineer extends JobRole {

 SoftwareEngineer(String name) {
     super(name);
 }

 // Override method
 void screenResume() {
     System.out.println(candidateName + " screened for Software Engineer role");
 }
}
