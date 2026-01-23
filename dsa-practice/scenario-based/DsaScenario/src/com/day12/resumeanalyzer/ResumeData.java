package com.day12.resumeanalyzer;

//Model class to store resume details
class ResumeData {
 String email;
 String phone;
 int keywordCount;

 ResumeData(String email, String phone, int keywordCount) {
     this.email = email;
     this.phone = phone;
     this.keywordCount = keywordCount;
 }
}
