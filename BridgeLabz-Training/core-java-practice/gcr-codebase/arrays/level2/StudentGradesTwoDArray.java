import java.util.Scanner;

public class StudentGradesTwoDArray
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		// Number of students
		System.out.println("Enter number of students:");
		int number = input.nextInt();
		
		// 2D array to store marks (0:Physics, 1:Chemistry, 2:Maths), percentage, grade
		double[][] studentData = new double[number][4];
		String[] grade = new String[number];
		
		// Input marks
		for(int i = 0; i < number; i++){
			System.out.println("Enter marks for student " + (i + 1) + ":");
			
			System.out.print("Physics: ");
			studentData[i][0] = input.nextDouble();
			if(studentData[i][0] < 0){
				System.out.println("Invalid marks, enter again");
				i--;
				continue;
			}
			
			System.out.print("Chemistry: ");
			studentData[i][1] = input.nextDouble();
			if(studentData[i][1] < 0){
				System.out.println("Invalid marks, enter again");
				i--;
				continue;
			}
			
			System.out.print("Maths: ");
			studentData[i][2] = input.nextDouble();
			if(studentData[i][2] < 0){
				System.out.println("Invalid marks, enter again");
				i--;
			}
		}
		
		// Calculate percentage and grade
		for(int i = 0; i < number; i++){
			studentData[i][3] = (studentData[i][0] + studentData[i][1] + studentData[i][2]) / 3;
			
			if(studentData[i][3] >= 80){
				grade[i] = "A";
			}else if(studentData[i][3] >= 70){
				grade[i] = "B";
			}else if(studentData[i][3] >= 60){
				grade[i] = "C";
			}else if(studentData[i][3] >= 50){
				grade[i] = "D";
			}else if(studentData[i][3] >= 40){
				grade[i] = "E";
			}else{
				grade[i] = "R";
			}
		}
		
		// Display results
		System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
		for(int i = 0; i < number; i++){
			System.out.printf("%.2f\t%.2f\t\t%.2f\t%.2f\t\t%s%n",
					studentData[i][0], studentData[i][1], studentData[i][2],
					studentData[i][3], grade[i]);
		}
		
		input.close();
	}
}
