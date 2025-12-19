import java.util.Scanner;

public class CheckAbundantNumber {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable for number, sum
        int number, sum = 0;
        System.out.print("Enter number: ");
        number = input.nextInt();

        // Check for abundant number
		for(int i = 1; i<number; i++){
			if(number%i==0){
				sum = sum+i;
			}
		}
		if(sum>number){
			System.out.println("Abundant Number");
		}else{
			System.out.println("Not an Abundant Number");

		}
		

        // Close scanner
        input.close();
    }
}
