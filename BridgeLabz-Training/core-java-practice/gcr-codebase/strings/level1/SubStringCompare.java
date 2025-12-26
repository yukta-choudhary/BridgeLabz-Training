import java.util.Scanner;

public class SubStringCompare {

	//Create a method to create substring using charAt method
	public static String SubStringUsingCharAt(String str, int startIndex, int endIndex){
		if(startIndex>=0 && endIndex<str.length() && startIndex<endIndex){
			System.out.println("Index is valid");
		}
		String result = "";
		for(int i = startIndex; i<endIndex; i++){
			result = result + str.charAt(i);
		}
		return result;
	}
	
	//Create a method to compare two strings using charAt
	public static boolean compareUsingCharAt(String string1, String string2){
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
		
		//Take string as input and endIndex and startIndex
		System.out.print("Enter string: ");
		String str = input.next();
		
		System.out.print("Enter startIndex: ");
		int startIndex = input.nextInt();
		
		System.out.print("Enter endIndex: ");
		int endIndex = input.nextInt();
		
		//Result from substring using charAt()
		String charAtResult = SubStringUsingCharAt(str, startIndex, endIndex);

		//Create substring using substring() method
		String subStringResult = str.substring(startIndex, endIndex);
		
		//Compare both strings using charAt and display result accordingly
		boolean compareResult = compareUsingCharAt(subStringResult, charAtResult);
		
		//Check if both results are equal
		if(compareResult){
			System.out.println("Comparison using charAt and substring method, the result is same.");
		}else{
			System.out.println("Comparison using charAt and substring method, the result is not same.");

		}
		input.close();
	}

}