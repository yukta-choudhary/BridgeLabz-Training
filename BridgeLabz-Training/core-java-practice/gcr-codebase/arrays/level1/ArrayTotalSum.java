import java.util.Scanner;

public class ArrayTotalSum
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Declare array and a variable total
		double total = 0.0;
		double[] numArr = new double[10];
		
		System.out.println("Enter the numbers: ");
		
		//Check for zero, negative and positive
		int index = 0;
		while(true){
			double tempValue = input.nextDouble();
			if((tempValue <= 0) || (index == 10)){
				break;
			}else{
				numArr[index] = tempValue;
				index++;

			}
		}
		
		//Calculate total
		for (int i = 0; i < numArr.length ; i++) {
            total = total + numArr[i];
		}
		System.out.println("The total sum of the array of numbers is " + total);


		//Close Scanner class object
        input.close();
    }
}