package com.day4.edumentor;

//Quiz class
public class Quiz {

 private String[] questions;   // private question bank
 private final int[] answers;   // answers cannot change
 int score;

 // Constructor with difficulty
 Quiz(String level) {
     if (level.equals("easy")) {
         questions = new String[]{"2+2?", "3+1?"};
         answers = new int[]{4, 4};
     } else {
         questions = new String[]{"5*2?", "10/2?"};
         answers = new int[]{10, 5};
     }
 }

 // Method to conduct quiz
 void takeQuiz(int[] userAns) {
     for (int i = 0; i < answers.length; i++) {
         if (userAns[i] == answers[i]) {
             score++; // operator usage
         }
     }
 }

 // Percentage calculation
 double getPercentage() {
     return (score * 100.0) / answers.length;
 }
}
