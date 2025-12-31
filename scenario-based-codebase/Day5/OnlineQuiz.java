/*
17. Online Quiz Application 🧠
Ask 5 questions (MCQs) from a user.
● Use arrays and for-loop.
● Record score.
● Switch for answer checking. Apply clear indentation and structured layout.
*/

import java.util.Scanner;

public class OnlineQuiz{

	public static void main(String[] args){
	
		//Create a scanner class object
		Scanner input = new Scanner(System.in);
		
		//Create arrays containing questions and its correct answer and explanations. Also answer user stores
		String[] questions = {
            "Q1. What cartoon character lives in a pineapple under the sea?\n" +
            "a) Patrick Star\n" +
            "b) Squidward Tentacles\n" +
            "c) SpongeBob SquarePants\n" +
            "d) Mr. Krabs",

            "Q2. Which country is known as the \"Land of the Rising Sun\"?\n" +
            "a) China\n" +
            "b) South Korea\n" +
            "c) Japan\n" +
            "d) Vietnam",

            "Q3. What is the largest mammal on Earth?\n" +
            "a) African Elephant\n" +
            "b) Blue Whale\n" +
            "c) Giant Squid\n" +
            "d) Giraffe",

            "Q4. How many bones are there in an adult human body?\n" +
            "a) 106\n" +
            "b) 206\n" +
            "c) 306\n" +
            "d) 196",

            "Q5. Which animal is known as the \"Ship of the Desert\"?\n" +
            "a) Elephant\n" +
            "b) Donkey\n" +
            "c) Horse\n" +
            "d) Camel"
        };
		
		char[] answers = {'c', 'c', 'b', 'b', 'd'};

        String[] explanations = {
            "SpongeBob SquarePants is the cartoon character who famously lives in a pineapple under the sea.",
            "Japan is called the \"Land of the Rising Sun\" because the sun rises there earlier than in many other places.",
            "The blue whale is the largest mammal on Earth, even bigger than elephants.",
            "An adult human body has 206 bones.",
            "The camel is called the \"Ship of the Desert\" for carrying loads across deserts efficiently."
        };

        // Create an array to store user answers (initialize with the same length as questions)
        char[] userAnswer = new char[questions.length];

        // Create a variable to store score
        int score = 0;

        System.out.println("----QUIZ----");

        // Loop through each question
        for (int i = 0; i < questions.length; i++) {
            System.out.println("\n" + questions[i]);
            System.out.print("Your answer: ");
            
            // Get user input and convert to lowercase for easier comparison
            userAnswer[i] = input.next().charAt(0);
            char userChoice = Character.toLowerCase(userAnswer[i]);

            // Use switch to check the answer
            switch (userChoice) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                    if (userChoice == answers[i]) {
                        System.out.println("Correct!");
                        score++;
                    } else {
                        System.out.println("Wrong!");
                    }
                    System.out.println(explanations[i]);
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }

        // Display score
		System.out.println("\n-------------------------------");
		System.out.println("YOUR SCORE");
		System.out.println("-------------------------------");
        System.out.println("Score: " + score + "/" + questions.length);

        // Display remarks according to the score
        if (score == 0) {
            System.out.println("Oops! Better luck next time!");
        } else if (score > 0 && score <= 3) {
            System.out.println("Good!");
        } else if (score == 4) {
            System.out.println("Great! Keep it up!");
        } else {
            System.out.println("Congratulations! You are a legend.");
        }
		input.close();
	
	}

}