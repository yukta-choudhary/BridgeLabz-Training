package com.day4.edumentor;

//Main class
import java.util.Scanner;

public class EduMentorApp {

 // Question:
 // Implement EduMentor platform with users, quiz and certificate

 public static void main(String[] args) {

     Scanner sc = new Scanner(System.in);

     // Learner input
     System.out.print("Enter name: ");
     String name = sc.nextLine();

     System.out.print("Enter email: ");
     String email = sc.nextLine();

     System.out.print("Enter user id: ");
     int id = sc.nextInt();
     sc.nextLine();

     System.out.print("Course type (short/full): ");
     String type = sc.nextLine();

     Learner l = new Learner(name, email, id, type);

     // Quiz input
     System.out.print("Quiz level (easy/hard): ");
     String level = sc.nextLine();

     Quiz q = new Quiz(level);

     int[] userAns = new int[2];

     System.out.print("Enter answer 1: ");
     userAns[0] = sc.nextInt();

     System.out.print("Enter answer 2: ");
     userAns[1] = sc.nextInt();

     q.takeQuiz(userAns);

     // Output
     System.out.println("Score: " + q.score);
     System.out.println("Percentage: " + q.getPercentage());

     l.generateCertificate();

     sc.close();
 }
}
