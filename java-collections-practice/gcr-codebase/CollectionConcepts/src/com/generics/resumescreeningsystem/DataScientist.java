package com.generics.resumescreeningsystem;

//Data Scientist role

class DataScientist extends JobRole {

 DataScientist(String name) {
     super(name);
 }

 // Override method
 void screenResume() {
     System.out.println(candidateName + " screened for Data Scientist role");
 }
}
