package com.generics.resumescreeningsystem;

//Question: Abstract class for all job roles

abstract class JobRole {
 String candidateName;

 // Constructor
 JobRole(String candidateName) {
     this.candidateName = candidateName;
 }

 // Abstract method
 abstract void screenResume();
}

