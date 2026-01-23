package com.day1.resumeanalyzer;
import java.util.*;

//Driver class
public class ResumeAnalyzerApp {
 public static void main(String[] args) {

     // Folder path containing resumes
     String folderPath = "resumes";

     Map<String, ResumeData> resumeMap =
             ResumeAnalyzer.readResumes(folderPath);

     // Convert map values to list
     List<ResumeData> list =
             new ArrayList<>(resumeMap.values());

     // Sort by keyword count (descending)
     list.sort((a, b) -> b.keywordCount - a.keywordCount);

     // Display result
     System.out.println("Filtered & Sorted Candidates:");
     for (ResumeData r : list) {
         System.out.println(
             r.email + " | " + r.phone + " | Keywords: " + r.keywordCount
         );
     }
 }
}

