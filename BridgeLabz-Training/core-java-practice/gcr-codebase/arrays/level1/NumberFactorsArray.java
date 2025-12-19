import java.util.Scanner;

public class NumberFactorsArray
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Declare variable number
		System.out.println("Enter the number to find its factors:");
		int number = input.nextInt();
		
		//Find factors of the number and save in an array
		int maxFactor = 10;
		int[] factors = new int[maxFactor];
		int index = 0;
		
		for(int i=1; i<=number; i++){
			if(number%i ==0){
				if(index == maxFactor){
					maxFactor = maxFactor*2;
					int[] temp = new int[maxFactor];
					for(int j = 0; j<factors.length; j++){
						temp[j] = factors[j];
					}
					factors = temp;
				}
				factors[index] = i;
				index++;
				
			}
		} 
		
		
		
		//Display factors
		System.out.println("Factors are ");
		for(int i = 0; i<index; i++){
			System.out.println(factors[i] + " ");

		}
		
		//Close Scanner class object
        input.close();
    }
}