import java.util.Scanner;

public class NumberMultiplesBelowHundred {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable for number 
        int number;
        System.out.print("Enter number: ");
        number = input.nextInt();

        // Find numbers below hundred that perfectly divide the number
		if(number == 0){
			System.out.println("The greatest factor of " + number + " is 0 ");

		}
		else if(number > 0 && number < 100){
			for(int i=100; i>=1; i--){
				if(number%i == 0){
					System.out.println(i + " " );
					continue;
				}
			}

		}else{
			System.out.println("It's either a negative number or greater than equal to 100");

		}

        // Close scanner
        input.close();
    }
}
