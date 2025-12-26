import java.util.Scanner;

public class EvenOddArrays
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Declare variable number
		System.out.println("Enter the number upto which you want to seperate:");
		int number = input.nextInt();
		
		//Check for natural number else print error and exit
		if (number < 0) {
            System.err.println("Invalid Number.");
            System.exit(0);
		}
		
		//Declare even and odd arrays
		int[] evenArr = new int[number];
		int[] oddArr = new int[number];
		
		//Declare odd and even indexes
		int odd = 0, even = 0;
		
		//Seperate even and odd arrays
		for(int i = 0; i<number; i++){
			
			System.out.println("Enter a number:");
			int tempNumber = input.nextInt();
			if(tempNumber%2 == 0){
				evenArr[even] = tempNumber;
				even = even + 1;
			}else{
				oddArr[odd] = tempNumber;
				odd = odd + 1;
			}
		}
		
		//Display even and odd arrays
		System.out.println("Even Array elements are ");
		for(int i = 0; i<even; i++){
			System.out.println(evenArr[i] + " ");

		}
		System.out.println("Odd Array elements are ");
		for(int i = 0; i<odd; i++){
			System.out.println(oddArr[i] + " ");

		}
		
		//Close Scanner class object
        input.close();
    }
}