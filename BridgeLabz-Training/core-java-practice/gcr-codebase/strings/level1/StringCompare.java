import java.util.Scanner;

public class StringCompare {

	//Create a method to compare two strings using charAt
	public static boolean CompareUsingCharAt(String string1, String string2){
		if(string1.length() != string2.length()){
			return false;
		}
		for(int i=0; i<string1.length(); i++){
			if(string1.charAt(i) != string2.charAt(i)){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		//Take string as input
		System.out.print("Enter first string: ");
		String string1 = input.next();
		
		System.out.print("Enter second string: ");
		String string2 = input.next();
		
		//Result from comparison  using charAt()
		boolean charAtResult = CompareUsingCharAt(string1, string2);

		//Compare two strings using equals() method
		boolean equalsResult = string1.equals(string2);
		
		//Check if both results are equal
		if(charAtResult == equalsResult){
			System.out.println("Comparison using charAt and equals method, the result is same.");
		}else{
			System.out.println("Comparison using charAt and equals method, the result is not same.");

		}
		input.close();
	}

}