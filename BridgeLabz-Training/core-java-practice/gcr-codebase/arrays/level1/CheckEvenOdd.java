import java.util.Scanner;

public class CheckEvenOdd
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Declare array
		int[] numArr = new int[5];
		System.out.println("Enter the numbers: ");
		for (int i = 0; i < numArr.length ; i++) {
            numArr[i] = input.nextInt();
		}
		
		//Check number positive or negative.
		// If positive check if its even or odd. 
		// Compare first and last elements of array whether its equal or greater
		for (int i = 0; i < numArr.length ; i++) {
            if(numArr[i]<0){
				System.out.println("Negative Number");

			}else if(numArr[i]>0){
				if(numArr[i]%2 == 0){
					System.out.println("The number " + numArr[i] + " is even.");
				}
				else{
					System.out.println("The number " + numArr[i] + " is odd.");
				}
			}else{
				System.out.println("The number is zero");
			}
			
		}
		if(numArr[0] == numArr[numArr.length -1]){
				System.out.println("The first and last elements of the array are equal.");
			}else if(numArr[0] > numArr[numArr.length -1]){
				System.out.println("The first element " + numArr[0] +" is greater than the last element " +  numArr[numArr.length -1] + " of the array.");
			}else{
				System.out.println("The last element " +  numArr[numArr.length -1] + " is greater than the first element " + numArr[0] +" of the array.");
		}
		

		//Close Scanner class object
        input.close();
    }
}