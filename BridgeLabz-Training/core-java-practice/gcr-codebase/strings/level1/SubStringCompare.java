import java.util.Scanner;

public class SubStringCompare {

	//Create a method to create substring using charAt method
	public static String SubStringUsingCharAt(String str, int startIndex, int endIndex){
		String result = "";
		for(int i = startIndex; i<endIndex; i++){
			result = result + str.charAt(i);
		}
		return result;
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
		
		//Check if both results are equal
		if(charAtResult.equals(subStringResult)){
			System.out.println("Comparison using charAt and substring method, the result is same.");
		}else{
			System.out.println("Comparison using charAt and substring method, the result is not same.");

		}
		input.close();
	}

}