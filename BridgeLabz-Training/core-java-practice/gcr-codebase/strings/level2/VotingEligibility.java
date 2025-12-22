import java.util.Scanner;

class VotingEligibility {

    // Method to take ages as user input
    public static int[] getStudentAges(int n) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        return ages;
    }

    // Method to check voting eligibility and return 2D array
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); 
            if (ages[i] < 0) {
                result[i][1] = "Cannot Vote";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] table) {
        System.out.println("\nAge - Eligibility");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + " - " + table[i][1]);
        }
    }

    public static void main(String[] args) {
        int numberOfStudents = 10;
        // Take ages of students
        int[] ages = getStudentAges(numberOfStudents);

        // Check voting eligibility
        String[][] votingTable = checkVotingEligibility(ages);

        // Display result
        displayTable(votingTable);
    }
}
