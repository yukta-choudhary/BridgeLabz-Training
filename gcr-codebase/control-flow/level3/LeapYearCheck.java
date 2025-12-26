import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable for year
        int year;
        System.out.print("Enter year: ");
        year = input.nextInt();

        // Check for leap year and display message
		if(year >= 1582){
			if(year % 400 == 0){
				System.out.println("The year " + year + " is a leap year");
			
			}else if (year%100 == 0){
					System.out.println("The year " + year + " is not a leap year");
			}
			else if(year%4 ==0){
				System.out.println("The year " + year + " is a leap year");
			}else{
				System.out.println("The year " + year + " is not a leap year");
			}
		}
		else{
			System.out.println("The year " + year + " must be greater than or equal to 1582.");
		}

        // Close scanner
        input.close();
    }
}
