import java.util.Scanner;

public class StudentScoreCardWithGrades {

    // Method to generate random scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 10 + (int)(Math.random() * 90); 
            scores[i][1] = 10 + (int)(Math.random() * 90); 
            scores[i][2] = 10 + (int)(Math.random() * 90); 
        }
        return scores;
    }

    // Method to calculate total, average, percentage, and grade
    public static Object[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        Object[][] results = new Object[numStudents][4];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 3; 

            // Round to 2 decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;

            // Determine grade based on percentage
            String grade;
            if (percentage >= 80) grade = "A";
            else if (percentage >= 70) grade = "B";
            else if (percentage >= 60) grade = "C";
            else if (percentage >= 50) grade = "D";
            else if (percentage >= 40) grade = "E";
            else grade = "R";

            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
            results[i][3] = grade;
        }

        return results;
    }

    // Method to display the scorecard
    public static void displayScoreCard(int[][] scores, Object[][] results) {
        System.out.println("Stu#\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i+1) + "\t" + scores[i][0] + "\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t" +
                               results[i][0] + "\t" + results[i][1] + "\t" + results[i][2] + "\t\t" + results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        // Generate scores
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, percentage, and grade
        Object[][] results = calculateResults(scores);

        // Display scorecard
        displayScoreCard(scores, results);
    }
}
