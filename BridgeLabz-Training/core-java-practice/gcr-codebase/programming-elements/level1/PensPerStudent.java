// This program calculates number of pens per student and non-distributed pens

public class PensPerStudent{
    public static void main(String[] args){

        // Create variable numOfPen, penPerStudent and nonDistributedPens
        int numOfPen = 14, penPerStudent, nonDistributedPens;

        // Calculate pensPerStudent and nonDistributedPens
        penPerStudent = numOfPen / 3;
	nonDistributedPens = numOfPen % 3;

        // Print penPerStudent and nonDistributedPens
        System.out.println(" The Pen Per Student is " + penPerStudent + " and the remaining pen not distributed is " + nonDistributedPens);
    }
}