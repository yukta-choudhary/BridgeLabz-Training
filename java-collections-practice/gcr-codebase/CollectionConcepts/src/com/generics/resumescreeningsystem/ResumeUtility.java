package com.generics.resumescreeningsystem;

import java.util.List;

//Utility class using generics and wildcards

class ResumeUtility {

 // Generic method
 static <T extends JobRole> void analyzeResume(T role) {
     role.screenResume();
 }

 // Wildcard method for multiple roles
 static void screeningPipeline(List<? extends JobRole> roles) {
     for (JobRole r : roles) {
         r.screenResume();
     }
 }
}
