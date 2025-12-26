import java.util.Scanner;

public class CheckStudentVotingAge
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Declare array
		int[] age = new int[10];
		System.out.println("Enter the age of the students: ");
		for (int i = 0; i < age.length ; i++) {
            age[i] = input.nextInt();
		}
		
		//Check student age valid or not for voting
		for (int i = 0; i < age.length ; i++) {
            if(age[i]<0){
				System.out.println("Invalid Age");
			}else if(age[i]>=18){
				System.out.println("The student with the age " + age[i] + " can vote.");
			}else{
				System.out.println("The student with the age " + age[i] + " cannot vote.");
			}
		}

		//Close Scanner class object
        input.close();
    }
}