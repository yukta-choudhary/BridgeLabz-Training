import java.util.Scanner;

public class NumberMultiplesBelowHundredUsingWhile {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable for number 
        int number;
        System.out.print("Enter number: ");
        number = input.nextInt();

        // Find numbers below hundred that perfectly divide the number using while loop 
		if(number == 0){
			System.out.println("The multiples of 0 is infinite");

		}
		else if(number > 0 && number < 100){
			int counter = number - 1;
			while(counter>1){
				if(number%counter == 0){
					System.out.println(counter + " " );
					

				}
				counter = counter -1;
				continue;
				
			}
			

		}else{
			System.out.println("It's either a negative number or greater than equal to 100");

		}

        // Close scanner
        input.close();
    }
}
