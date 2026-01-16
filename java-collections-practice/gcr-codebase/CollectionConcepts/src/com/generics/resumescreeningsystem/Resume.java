package com.generics.resumescreeningsystem;

//Generic Resume class
//T must extend JobRole

class Resume<T extends JobRole> {

 T role;

 // Constructor
 Resume(T role) {
     this.role = role;
 }

 // Process resume
 void process() {
     role.screenResume();
 }
}
