import java.util.Scanner;

public class EmployeeBonus
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		// Declare arrays for salary and years of service.
		double[] salary = new double[10];
		double[] service = new double[10];
		double[] bonus = new double[10];
		double[] newSalary = new double[10];
		
		double totalBonus = 0;
		double totalOldSalary = 0;
		double totalNewSalary = 0;
		
		// Take input for employees
		for(int i = 0; i < 10; i++){
			System.out.println("Enter salary for employee " + (i + 1) + ":");
			salary[i] = input.nextDouble();
			
			System.out.println("Enter years of service for employee " + (i + 1) + ":");
			service[i] = input.nextDouble();
			
			if(salary[i] <= 0 || service[i] < 0){
				System.out.println("Invalid input, enter again");
				i--;
			}
		}
		
		// Calculate bonus and new salary
		for(int i = 0; i < 10; i++){
			if(service[i] > 5){
				bonus[i] = salary[i] * 0.05;
			}else{
				bonus[i] = salary[i] * 0.02;
			}
			
			newSalary[i] = salary[i] + bonus[i];
			
			totalBonus += bonus[i];
			totalOldSalary += salary[i];
			totalNewSalary += newSalary[i];
		}
		
		// Display results
		System.out.println("Total Bonus Amount: " + totalBonus);
		System.out.println("Total Old Salary: " + totalOldSalary);
		System.out.println("Total New Salary: " + totalNewSalary);
		
		// Close Scanner class object
		input.close();
	}
}
