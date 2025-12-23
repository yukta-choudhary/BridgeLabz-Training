import java.util.*;

public class ReverseString {
	
	public static String reverseString (String text) {
		
		char[] chars = text.toCharArray();
		int start = 0;
		int end = chars.length - 1;
		
		while (start < end) {
		
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;
		
			start++;
			end--;
		}
	
		return new String(chars);
	}


	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter string:");
		String text = input.nextLine();
	
		String result = reverseString(text);

		System.out.println("Reversed string is: " + result);

		input.close();
	}
}