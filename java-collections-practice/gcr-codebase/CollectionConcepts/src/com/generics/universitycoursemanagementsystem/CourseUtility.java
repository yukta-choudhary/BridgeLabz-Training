package com.generics.universitycoursemanagementsystem;

import java.util.List;

//Utility class using wildcard

class CourseUtility {

 // Wildcard method to handle any course type
 static void displayCourses(List<? extends CourseType> courses) {
     for (CourseType c : courses) {
         c.evaluate();
     }
 }
}

