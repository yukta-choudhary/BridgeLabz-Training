import java.util.Scanner;

public class CopyArray
{
	public static void main(String[] args)
	{
		// Create scanner class object
		Scanner input = new Scanner(System.in);
		
		//Declare variable row and column
		System.out.println("Enter the number of row:");
		int row = input.nextInt();
		System.out.println("Enter the number of column:");
		int column = input.nextInt();
		
		//Declare 2D and 1D array
		int[][] matrix = new int[row][column];
		int[] oneDArray = new int[row*column];
		int index = 0;
		
		// Take input in 2D array
		System.out.println("Enter elements of 2D array: ");
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				matrix[i][j] = input.nextInt();
			}
		} 
		
		//Copy matrxi array to oneDArray
		
		for(int i=0; i<row; i++){
			for(int j=0; j<column; j++){
				oneDArray[index] = matrix[i][j];
				index++;
			}
		} 
		
		//Display oneDArray elements
		System.out.println("Elements of 1D array are ");
		for(int i=0; i<index; i++){
			System.out.println(oneDArray[i]);
		} 
		
		//Close Scanner class object
        input.close();
    }
}