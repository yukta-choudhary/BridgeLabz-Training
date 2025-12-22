import java.util.Scanner;

public class CharArrayCompare {

	//Create a method to return characters in a string using user defined method
	public static char[] getUserCharArray(String str){
		char[] userCharArray = new char[str.length()];
		for(int i = 0; i<str.length(); i++){
			userCharArray[i] = str.charAt(i);
		}
		return userCharArray;
	}
	
	//Create a method to compare the results
	public static boolean compareMethods(char[] userCharArrayResult, char[] toCharArrayResult){
		if(userCharArrayResult.length != toCharArrayResult.length){
			return false;
			
		}
		for (int i = 0; i < toCharArrayResult.length; i++) {
            if (userCharArrayResult[i] != toCharArrayResult[i]) {
                return false;
            }
        }
		return true;
	}

	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		//Take string as input
		System.out.print("Enter string: ");
		String str = input.next();
		
		//Result from getUserCharArray
		char[] userCharArrayResult = getUserCharArray(str);

		//Create a character array using toCharArray()
		char[] toCharArrayResult = str.toCharArray();
		
		//Call method to check if the result from both methods are same
		if(compareMethods(userCharArrayResult, toCharArrayResult)){
			System.out.println("Are the results same? Yes");
		}else{
			System.out.println("Are the results same? No");
		}
		input.close();
	}

}