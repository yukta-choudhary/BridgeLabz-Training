package com.day3.examproctor;

import java.util.HashMap;
import java.util.Scanner;

public class ExamProctor {

    // Function to calculate score
    public static int calculateScore(HashMap<Integer, String> studentAnswers, HashMap<Integer, String> correctAnswers) {
        int score = 0;
        for (int qid : correctAnswers.keySet()) {
            if (studentAnswers.containsKey(qid) && studentAnswers.get(qid).equalsIgnoreCase(correctAnswers.get(qid))) {
                score += 1; // 1 mark per correct answer
            }
        }
        return score;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Correct answers
        HashMap<Integer, String> correctAnswers = new HashMap<>();
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "B");
        correctAnswers.put(3, "C");
        correctAnswers.put(4, "D");

        // Student answers
        HashMap<Integer, String> studentAnswers = new HashMap<>();
        QuestionStack navStack = new QuestionStack();

        while (true) {
            System.out.println("\n1. Answer Question");
            System.out.println("2. Go Back to Last Question");
            System.out.println("3. Submit Exam");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            if (choice == 1) {
                System.out.print("Enter Question ID: ");
                int qid = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter your answer: ");
                String ans = sc.nextLine();
                studentAnswers.put(qid, ans);
                navStack.push(qid); // track navigation
                System.out.println("Answer saved.");

            } else if (choice == 2) {
                int lastQ = navStack.pop();
                if (lastQ != -1) {
                    System.out.println("Returning to Question ID: " + lastQ);
                    System.out.println("Your previous answer: " + studentAnswers.get(lastQ));
                }

            } else if (choice == 3) {
                int totalScore = calculateScore(studentAnswers, correctAnswers);
                System.out.println("Exam submitted!");
                System.out.println("Your Score: " + totalScore + "/" + correctAnswers.size());
                break;

            } else {
                System.out.println("Invalid choice!");
            }
        }

        sc.close();
    }
}
