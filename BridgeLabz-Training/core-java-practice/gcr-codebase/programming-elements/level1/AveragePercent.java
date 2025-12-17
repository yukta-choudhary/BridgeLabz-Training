// This program calculate average percentage of marks secured by Sam in physics, chemistry and maths.

class AveragePercent{
    public static void main(String[] args){
        // Create variable physicsMarks, chemMarks, mathsMarks and avgPercent
        int physicsMarks = 95, chemMarks = 96, mathsMarks = 94;
        double avgPercent;

        // Calculate Average Percentage
        avgPercent = ((double)(physicsMarks + chemMarks + mathsMarks)/(double)300) * 100;

        // Print Average Percentage
        System.out.println("Average Percentage of Sam is " + avgPercent);
    }
}