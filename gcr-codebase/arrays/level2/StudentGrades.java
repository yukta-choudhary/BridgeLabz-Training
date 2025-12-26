import java.util.Scanner;

public class StudentGrades
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		// Number of students
		System.out.println("Enter number of students:");
		int number = input.nextInt();
		
		// 2D array
		double[][] marks = new double[number][3];
		double[] percentage = new double[number];
		String[] grade = new String[number];
		
		// Input marks
		for(int i = 0; i < number; i++){
			System.out.println("Enter marks in Physics for student " + (i + 1) + ":");
			marks[i][0] = input.nextDouble();
			if(marks[i][0] < 0){
				System.out.println("Invalid marks, enter again");
				i--;
				continue;
			}
			
			System.out.println("Enter marks in Chemistry for student " + (i + 1) + ":");
			marks[i][1] = input.nextDouble();
			if(marks[i][1] < 0){
				System.out.println("Invalid marks, enter again");
				i--;
				continue;
			}
			
			System.out.println("Enter marks in Maths for student " + (i + 1) + ":");
			marks[i][2] = input.nextDouble();
			if(marks[i][2] < 0){
				System.out.println("Invalid marks, enter again");
				i--;
			}
		}
		
		// Calculate percentage and grade
		for(int i = 0; i < number; i++){
			percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
			
			if(percentage[i] >= 80){
				grade[i] = "A";
			}else if(percentage[i] >= 70){
				grade[i] = "B";
			}else if(percentage[i] >= 60){
				grade[i] = "C";
			}else if(percentage[i] >= 50){
				grade[i] = "D";
			}else if(percentage[i] >= 40){
				grade[i] = "E";
			}else{
				grade[i] = "R";
			}
		}
		
		// Display results
		System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
		for(int i = 0; i < number; i++){
			System.out.printf("%.2f\t%.2f\t\t%.2f\t%.2f\t\t%s%n",
					marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
		}
		
		input.close();
	}
}
