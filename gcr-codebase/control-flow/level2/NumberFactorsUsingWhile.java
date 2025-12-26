import java.util.Scanner;

public class NumberFactorsUsingWhile {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables for number
        int number;
        System.out.print("Enter number: ");
        number = input.nextInt();

        // Find factors using while loop if number is positive
		if(number == 0){
			System.out.println("The factor of " + number + " is 0 ");

		}
		else if(number > 0){
			System.out.println("The factors of " + number + " are ");
			int i=1;
			while(i<=number){
				if(number%i == 0){
					System.out.println(i + " ");
				}
				i =  i+1;
			}
		}else{
			System.out.println("It's a negative number.");

		}

        // Close scanner
        input.close();
    }
}
