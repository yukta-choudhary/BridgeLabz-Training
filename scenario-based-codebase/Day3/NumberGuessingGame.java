import java.util.Scanner;

public class NumberGuessingGame{
	public static void main(String[] args){
		
		//Create a scanner class object
		Scanner input = new Scanner(System.in);
		
		//Set a random number between 1 to 100 for the user to guess
		int guessNumber = (int)(Math.random()*100 + 1);
		
		//Count the number of tries
		int tryCount = 0;
		
		//Ask the user to guess the number between 1 to 100.
		System.out.print("I thought a number between 1 to 100. Now guess the number: ");
		int numberTry = input.nextInt();
		
		//Give hint to the user for the number he guessed
		while(true){
			if(tryCount<5){
				if(numberTry == guessNumber){
					System.out.println("Wohoo! You won! You guessed the correct number. ");
					break;
				}else{
					if(numberTry > guessNumber){
						System.out.println("Your guess is too high. Try again! ");
						numberTry = input.nextInt();
						tryCount++;

					}else{
						System.out.println("Your guess is too low. Try again! ");
						numberTry = input.nextInt();
						tryCount++;	
					}
				}
			}else{
				System.out.println("Oh No! You are out of tries. Better luck next time!");
				System.out.println("The number was " + guessNumber);
				break;
			}
			
		}
		input.close();
	}
}